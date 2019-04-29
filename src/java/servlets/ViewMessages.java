/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Beans.ContactBean;
import static Beans.ContactBean.factory;
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
import models.Messages;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author AMO
 */
public class ViewMessages extends HttpServlet {
   public static SessionFactory factory = GetFactory.getFactory();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          //create a list to hold the messages from the database
           Session session = factory.openSession();
          try{
        
         Criteria criteria = session.createCriteria(Messages.class);
         List<Messages> message = new ArrayList<>();
         message = criteria.list();
         session.close();
         request.setAttribute("messages",message);
         RequestDispatcher rd = request.getRequestDispatcher("ViewMessages.jsp");
         rd.forward(request, response);
          }
          catch(Exception e){
          }
     finally{
          }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try{
          //create a list to hold the messages from the database
         Session session = factory.openSession();
         Criteria criteria = session.createCriteria(Messages.class);
        List<Messages> message = new ArrayList<>();
        message = criteria.list();
        session.close();
        System.out.println("this is the message:"+message);
        //pass the messages list to the jsp
        request.setAttribute("messages",message);
         RequestDispatcher rd = request.getRequestDispatcher("ViewMessages.jsp");
        rd.forward(request, response);
        }
        catch(Exception e){
       
        
        System.out.println("Error message");}
    
    
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
