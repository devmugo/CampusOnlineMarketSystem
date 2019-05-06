/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import factory.GetFactory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import models.Upload;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@MultipartConfig(maxFileSize = 16177215)
public class PhotoUploadHib extends HttpServlet {
    String success;
    String error;

    public static SessionFactory factory = GetFactory.getFactory();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //open the hibernate session
        Session session = factory.openSession();
        
        try {
            //get the values from the jsp
            Transaction transaction = session.beginTransaction();
             HttpSession sessionsa = request.getSession(false);
             String id = (String) sessionsa.getAttribute("nationalid");
           
           String category = request.getParameter("category");
            String brand = request.getParameter("brand");
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	    Date date = new Date();
           
            System.out.println(category);
            Part part = request.getPart("photo") ;
            InputStream in = part.getInputStream();
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            byte[] buffer = new byte[10240];
            for (int length = 0; (length = in.read(buffer)) > 0;) {
                output.write(buffer, 0, length);
            }
            String age = request.getParameter("itemage");
            String cond = request.getParameter("condition");
             String desc = request.getParameter("description");
            Double price = Double.parseDouble(request.getParameter("price"));

            Upload upload = new Upload(id, category.toUpperCase(), brand.toUpperCase(), output.toByteArray(), age, cond, price,date,desc);
            session.save(upload);
            transaction.commit();
            success="Upload was successful.Successful purchases will be notified via email";
            request.setAttribute("success",success);
            request.getRequestDispatcher("/UploadHib.jsp").forward(request, response);
          
            
        } catch (Exception e) {
            error="Upload was not successful.Please try again later";
            request.setAttribute("error",error);
            request.getRequestDispatcher("/UploadHib.jsp").forward(request, response);
            
        }
        finally{
            session.close();
           
        
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
