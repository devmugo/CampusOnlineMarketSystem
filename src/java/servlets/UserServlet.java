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

import models.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import static servlets.LoginServlet.factory;

/**
 *
 * 
 */
public class UserServlet extends HttpServlet {

    public static SessionFactory factory = GetFactory.getFactory();
    String error;
    String success;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Session session = factory.openSession();
        try {
            Transaction transaction = session.beginTransaction();
            String nationalId = request.getParameter("id");
            String firstName = request.getParameter("fname");
            String lastName = request.getParameter("lname");
            String phone = request.getParameter("phone");
            String email = request.getParameter("email");
            String residence = request.getParameter("residence");
            String pwencrypt = request.getParameter("pass");

            Users user = new Users(nationalId, firstName, lastName, phone, email, residence, pwencrypt);
            session.save(user);
            transaction.commit();
            success = "User Added Successfully.You can now log in into the system";
            request.setAttribute("success", success);
           
            

        } catch (Exception e) {
         
            error = "Another User with same email exists. Please use your email";
            request.setAttribute("error", error);
          
        } finally {
            session.close();
             request.getRequestDispatcher("/Register.jsp").forward(request, response);
            
            
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
