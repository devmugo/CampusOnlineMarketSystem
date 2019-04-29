/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import factory.GetFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.TransactionClass;
import models.DoneTransactions;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


/**
 *
 * @author AMO
 */
public class CompletedTransactions extends HttpServlet {
     public static SessionFactory factory = GetFactory.getFactory();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Session session = factory.openSession();
       
      try{
        int transid = Integer.parseInt(request.getParameter("transid"));
        Transaction txn = session.beginTransaction();
        
         System.out.println(transid);
        TransactionClass transn = (TransactionClass) session.get(TransactionClass.class, transid);
        String buyerid = transn.getBuyerid();
        String sellerid = transn.getSellerid();
        String itemsold = transn.getItemsold();
        
        Date date = new Date(); 
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
        String datedone = formatter.format(date);  
        
        DoneTransactions done = new DoneTransactions(transid,datedone,itemsold,sellerid,buyerid);
        
         if(transn!=null){
            session.delete(transn);
         }
        
         
        session.save(done);
         
         txn.commit();
         session.close();
        
       
      }
      catch(Exception e ){
          System.out.println(e.getMessage());
      }
      finally{
       response.sendRedirect("ViewTransactions");
      }
        
      
        

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
