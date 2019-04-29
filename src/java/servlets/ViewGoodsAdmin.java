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
import models.Messages;
import models.Upload;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author AMO
 */
public class ViewGoodsAdmin extends HttpServlet {

    String success;
    String error;
    public static SessionFactory factory = GetFactory.getFactory();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Session session = factory.openSession();
        Criteria criteria = session.createCriteria(Upload.class);
        List<Upload> alluploads = new ArrayList<>();
        alluploads = criteria.list();
        session.close();
        request.setAttribute("alluploads", alluploads);
        RequestDispatcher rd = request.getRequestDispatcher("ViewUploadsAdmin.jsp");
        rd.forward(request, response);
        System.out.println(alluploads);

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
