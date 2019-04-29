/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import factory.GetFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.TransactionClass;
import models.Users;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import static servlets.ViewTransactions.factory;

/**
 *
 * @author AMO
 */
public class ViewContactS extends HttpServlet {
    public static SessionFactory factory = GetFactory.getFactory();

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         Session session = factory.openSession();
          try{
                Criteria criteria = session.createCriteria(Users.class);
                List<Users> users = new ArrayList<>();
                users = criteria.list();
                request.setAttribute("users", users);
                 
            } 
          catch(Exception e){
              
          }
        
        finally{
               session.close();
                 RequestDispatcher rd = request.getRequestDispatcher("ViewContacts.jsp");
                rd.forward(request, response);
          }
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
