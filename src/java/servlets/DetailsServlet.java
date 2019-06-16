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
import java.util.Base64;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Upload;
import models.Users;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import static servlets.LoginServlet.factory;

/**
 *
 * @author AMO
 */
public class DetailsServlet extends HttpServlet {

    public static SessionFactory factory = GetFactory.getFactory();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int index = Integer.parseInt(request.getParameter("index"));

        try {

            Session session = factory.openSession();

           
            
            Criteria criteria = session.createCriteria(Upload.class);
            criteria.add(Restrictions.eq("itemindex", index));
            List<Upload> upload = new ArrayList<>();
            upload = criteria.list();
             for(Upload up : upload){
             byte[] img = up.getImage();
             String b64 = Base64.getEncoder().encodeToString(img);
             up.setB64(b64);
         
      }
            request.setAttribute("upload", upload);
         
            request.getRequestDispatcher("showdetails.jsp").forward(request, response);
             session.close();

        } catch (Exception e) {
            

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
