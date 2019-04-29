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
import javax.servlet.http.HttpSession;
import models.Upload;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;


/**
 *
 * @author AMO
 */
public class ViewOwnUploads extends HttpServlet {
     public static SessionFactory factory = GetFactory.getFactory();

    
    

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sessionsa = request.getSession(false);
         Session session = factory.openSession();
         try{
          String nationalid = (String) sessionsa.getAttribute("nationalid");
           
         Criteria criteria = session.createCriteria(Upload.class);
         criteria.add(Restrictions.eq("nationalid", nationalid));
         List<Upload> ownuploads = new ArrayList<>();
         ownuploads= criteria.list();  
         session.close();
          request.setAttribute("ownuploads", ownuploads);
         
         }
         catch(Exception e){
           
         }
         finally{
              RequestDispatcher rd = request.getRequestDispatcher("viewOwnUploads.jsp");
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
