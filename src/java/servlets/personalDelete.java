/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import factory.GetFactory;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Upload;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import static servlets.Transactions.factory;

/**
 *
 * @author AMO
 */
public class personalDelete extends HttpServlet {
     String success;
    String error;
     public static SessionFactory factory = GetFactory.getFactory();

   
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         Session session = factory.openSession();
         try{ 
           Transaction txn = session.beginTransaction();
           int index = Integer.parseInt(request.getParameter("index"));
         
           
           Upload deleteitem = (Upload) session.get(Upload.class, index);
           session.delete(deleteitem);
           txn.commit();
           session.close();
           success ="Item deleted successfully";
           request.setAttribute("success",success);
           
                     
         
         }
         
        catch(Exception e){
            if(e.getMessage()==null){
            
         error ="Item not deleted";
          request.setAttribute("error",error);
         
            }
                
                }
        finally{
             request.getRequestDispatcher("/ViewOwnUploads").forward(request, response);
         
         
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
