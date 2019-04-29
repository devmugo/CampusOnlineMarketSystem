/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import factory.GetFactory;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Messages;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


/**
 *
 * @author AMO
 */
public class Contact_us extends HttpServlet {
     public static SessionFactory factory = GetFactory.getFactory();
     String error;
    String success;

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Session session = factory.openSession();
        
        try{
        Transaction transaction = session.beginTransaction();
        String name = request.getParameter("name");
        String number = request.getParameter("number");
        String subject = request.getParameter("subject");
        String message= request.getParameter("message");
       Messages messag = new Messages(name,number,subject,message);
       session.save(messag);
       transaction.commit();
       success=" Message sent successfully";
       request.setAttribute("success",success);
       request.getRequestDispatcher("/Contact_Us.jsp").forward(request, response);
       
        
        
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            error="Message not sent.Try again";
            request.setAttribute("error",error);
           request.getRequestDispatcher("/Contact_Us.jsp").forward(request, response);
        }
    finally {
            session.close();
            request.getRequestDispatcher("/Welcome.jsp").forward(request, response);
        }
        
               }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

    }

