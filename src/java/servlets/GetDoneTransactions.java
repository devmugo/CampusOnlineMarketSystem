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
import models.DoneTransactions;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


/**
 *
 * @author AMO
 */
public class GetDoneTransactions extends HttpServlet {
 public static SessionFactory factory = GetFactory.getFactory();

 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Session session = factory.openSession();
        
          try{
        
         Criteria criteria = session.createCriteria(DoneTransactions.class);
         List<DoneTransactions> transacts = new ArrayList<>();
         transacts = criteria.list();
         session.close();
         request.setAttribute("transacts",transacts);
         
         RequestDispatcher rd = request.getRequestDispatcher("completetransactions.jsp");
         rd.forward(request, response);
          }
          catch(Exception e){
          }
     finally{
          }
    
        
       
    

    
    }

}
