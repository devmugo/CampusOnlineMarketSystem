/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Beans.Emailbean;
import factory.GetFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.TransactionClass;
import models.Users;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import static servlets.MailServlet.factory;

/**
 *
 * @author AMO
 */
public class InformBuyerServlet extends HttpServlet {
     @EJB
    private Emailbean mailsender;
    public static SessionFactory factory = GetFactory.getFactory();

   

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       
        Session session = factory.openSession();
try{
        int index = Integer.parseInt(request.getParameter("index"));
        //begin hibernate transaction
        Transaction txn = session.beginTransaction();
        //create an instance of transaction class
        TransactionClass tsn = (TransactionClass) session.get(TransactionClass.class, index);
        String id = tsn.getBuyerid();
        String itemsold = tsn.getItemsold();
        Date date = tsn.getDate();
        int tid = tsn.getTransactionId();

        String hql = "from Users user where user.nationalId=:id";

        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        
        List results = (ArrayList)query.list();
        Users user = (Users)results.get(0);
        String toemail = user.getEmail();
        
        
        try{
        String message = "Greetings . The Item you Bought on our website " + itemsold + "  on  "  + date + "  is ready for pick up at our offices .Pick it within two working  days"
                + " transaction id is  "+ tid +"  " ;
        
       try {
            String subject="Campus Market sales";
          final String from ="mugomwash@gmail.com";
          final String password="mibmusavpexjnvxm";
          final String username="mugomwash@gmail.com";
          
          Properties props = System.getProperties();
          props.put("mail.smtp.host","smtp.gmail.com");
          props.put("mail.smtp.auth","true");
          props.put("mail.smtp.port","465");
          props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
          props.put("mail.smtp.socketFactory.port","465");
          props.put("mail.smtp.socketFactory.fallback","false");
          
          javax.mail.Session mailsn = javax.mail.Session.getDefaultInstance(props, null);
          mailsn.setDebug(true);
          Message msg = new MimeMessage(mailsn);
          msg.setFrom(new InternetAddress(from));
          msg.setRecipient(Message.RecipientType.TO,new InternetAddress(toemail));
          msg.setContent(message,"text/html");
          msg.setSubject(subject);
          
          Transport transport = mailsn.getTransport("smtp");
          transport.connect("smtp.gmail.com", username, password);
          transport.sendMessage(msg,msg.getAllRecipients());
          
          
          
          
      } catch (Exception ex) {
          Logger.getLogger(Emailbean.class.getName()).log(Level.SEVERE, null, ex);
               System.out.println("Bean Error " + ex.getMessage());
      }
     
        String messag = "Mail sent Successfully";
         System.out.println("message  sent");
        request.setAttribute("message",messag);
        tsn.setItemdelivered("yes");
        response.sendRedirect("ViewTransactions");
        
        }
        catch (Exception e ){
        System.out.println("message not sent");
        String error="mail not sent ";
        request.setAttribute("error",error);
        System.out.println(e.getMessage());
           response.sendRedirect("ViewTransactions");
        
        }
         txn.commit();
         session.close();
           
          
        
        
}
catch(Exception e ){
       response.sendRedirect("ViewTransactions");
    


}
finally{
          
        
           
}
    }

}

    


