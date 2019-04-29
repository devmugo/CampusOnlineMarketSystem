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
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author AMO
 */
public class ViewTransactions extends HttpServlet {
     public static SessionFactory factory = GetFactory.getFactory();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            Session session = factory.openSession();
            try{
                Criteria criteria = session.createCriteria(TransactionClass.class);
                List<TransactionClass> txns = new ArrayList<>();
                txns = criteria.list();
                 request.setAttribute("transactions", txns);
             
                 
            } 
            catch(Exception e){
            
            
            }
            finally{
                session.close();
                 RequestDispatcher rd = request.getRequestDispatcher("ViewTransactions.jsp");
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
    }// </editor-fold>

}
