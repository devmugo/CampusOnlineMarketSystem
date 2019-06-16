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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
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
        Session dbsession = factory.openSession();
       
      try{
        int transid = Integer.parseInt(request.getParameter("transid"));
        Transaction txn = dbsession.beginTransaction();
        System.out.println(transid);
        
        
        TransactionClass transn = (TransactionClass) dbsession.get(TransactionClass.class, transid);
        String buyerid = transn.getBuyerid();
        String sellerid = transn.getSellerid();
        String category = transn.getItem();
        String brand = transn.getBrand();
        Double price =transn.getPrice();
        int iprice =price.intValue();
        int amountpaid = (int) (iprice*0.9);
        int commission = (iprice-amountpaid);
        
        Date date = new Date(); 
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd"); 
        String datedone = formatter.format(date);  
        
        
        DoneTransactions done = new DoneTransactions(transid,datedone,category,brand,sellerid,buyerid,price,amountpaid,commission);
        
        
            dbsession.delete(transn);
         
        
         
        dbsession.save(done);
         
         txn.commit();
         dbsession.close();
      
        
       
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
