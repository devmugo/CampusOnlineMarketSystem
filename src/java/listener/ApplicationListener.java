/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;

import factory.GetFactory;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import models.DoneTransactions;
import models.Messages;
import models.TransactionClass;
import models.Upload;
import models.Users;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import servlets.LoginServlet;


/**
 * Web application lifecycle listener.
 *
 * @author amo
 */
@WebListener()
public class ApplicationListener implements ServletContextListener {

    private SessionFactory factory;
    private ServiceRegistry registry;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            Configuration configuration = new Configuration().configure();
            configuration.addAnnotatedClass(Users.class);
            configuration.addAnnotatedClass(Messages.class);
            configuration.addAnnotatedClass(Upload.class);
            configuration.addAnnotatedClass(TransactionClass.class);
             configuration.addAnnotatedClass(DoneTransactions.class);
           
            
            registry = new StandardServiceRegistryBuilder().applySettings(
                    configuration.getProperties()).build();
            factory = configuration.buildSessionFactory(registry);
            sce.getServletContext().setAttribute("factory", factory);
            sce.getServletContext().setAttribute("registry", registry);
//            LoginServlet.factory = factory;
//            TenderServlet.factory = factory;
//            AccountDetailsServlet.factory = factory;
//            ChangeDetailsServlet.factory = factory;
//            SupplyServlets.factory = factory;
//            SupplierServlet.factory = factory;
            GetFactory.setFactory(factory);

            Session session = factory.openSession();
            Transaction tx = null;
            Users admin = new Users("33187508", "James","mwangi" ,"0790842468","admin","ngondu","123456" );
            
            try {
                tx = session.beginTransaction();
                session.saveOrUpdate(admin);
                
                tx.commit();
            } catch (HibernateException e) {
                if (tx != null) {
                    tx.rollback();
                }
                System.err.println("Hibernate error occurred: " + e);
            } finally {
                session.close();
            }
        } catch (HibernateException e) {
            System.err.println("Failed to create sessionFactory object: " + e);
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        factory = (SessionFactory) sce.getServletContext().getAttribute("factory");
        registry = (ServiceRegistry) sce.getServletContext().getAttribute("registry");
        try {
            if ((factory != null) && (registry != null)) {
                factory.close();
                StandardServiceRegistryBuilder.destroy(registry);
            }
        } catch (HibernateException e) {
            System.err.println("Failed to close factory: " + e);
        }
    }
}
