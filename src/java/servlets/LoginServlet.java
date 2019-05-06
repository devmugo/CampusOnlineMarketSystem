/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import factory.GetFactory;
import models.Users;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import static servlets.UserServlet.factory;

/**
 *
 * @author AMO
 */
public class LoginServlet extends HttpServlet {
     public static SessionFactory factory = GetFactory.getFactory();
     String success;
     String error;
     
     

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //open hibernate session
        Session session = factory.openSession();
        session.beginTransaction();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        HttpSession sessionScope = request.getSession();
        
         try{
        Users user=null ; 
        //getting the user object
        user = (Users) session.get(Users.class, username);
        String uname = user.getEmail();
        String pass = user.getPwencrypt();
        
       
        //admin log in
        if(uname.equalsIgnoreCase("admin") && pass.equals(password)){
           sessionScope.setAttribute("loggedIn", true);
           sessionScope.setAttribute("user" ,user.getFirstName());
           sessionScope.setAttribute("nationalid", user.getNationalId());
           success= "Welcome " + user.getFirstName();
           request.setAttribute("success", success);
           response.sendRedirect("ViewTransactions");
           
            
        }//normal user log in
         else if(uname.equalsIgnoreCase(username) && pass.equals(password)){
           
           sessionScope.setAttribute("loggedIn", true);
           sessionScope.setAttribute("user" ,user.getFirstName());
           sessionScope.setAttribute("nationalid", user.getNationalId());
           success= "Welcome " + user.getFirstName();
           request.setAttribute("success", success);
           response.sendRedirect("ShowGoods");
           
         
          
            
        }
                    
                    
        
        else{
               sessionScope.setAttribute("loggedIn",false);
                error = "Wrong user name or password ";
                request.setAttribute("error", error);
               request.getRequestDispatcher("Login.jsp").forward(request, response);
                
        }
        }
         catch(Exception e){
               error= "Wrong Password or User name ";
               request.setAttribute("error",error);
               sessionScope.setAttribute("loggedIn",false);
               request.getRequestDispatcher("Login.jsp").forward(request, response);
                
         }
         finally{
         session.close();
         }
      
        }
        
       
      
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
