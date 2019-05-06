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
import models.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class ResetPasswordServlet extends HttpServlet {
    public static SessionFactory factory = GetFactory.getFactory();  
    
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Session session = factory.openSession();
        
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        System.out.println(email);
        try{
          Transaction txn = session.beginTransaction();
         Users user = (Users) session.get(Users.class, email);
         user.setPwencrypt(password);
         txn.commit();
         session.close();
         String success ="Password reset was successful.Click log in button below to Log in";
         request.setAttribute("message", success);
         request.getRequestDispatcher("Changepassoword.jsp").forward(request, response);
         
      }
        catch (Exception e ){
           String error = "Password Change unsuccessful probably due to network problems";
           request.setAttribute("error",error);
          request.getRequestDispatcher("Changepassoword.jsp").forward(request, response);  
        
        
        }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
