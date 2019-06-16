/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import factory.GetFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.TransactionClass;
import models.Upload;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author AMO
 */
public class Transactions extends HttpServlet {

    String success;
    String error;
    public static SessionFactory factory = GetFactory.getFactory();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Session session = factory.openSession();

        try {

            Transaction txn = session.beginTransaction();
            int index = Integer.parseInt(request.getParameter("index"));
            Upload itemonsale = (Upload) session.get(Upload.class, index);

            String sellerid = itemonsale.getNationalid();
            Double price = itemonsale.getPrice();
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String datei = formatter.format(date);
            System.out.println(date);
            System.out.println(datei);
            
            String category = itemonsale.getCategory();

            String Brand = itemonsale.getBrand();
           // String brand = Brand.concat(" ");
           // String itemsold = brand.concat(item);
            HttpSession sessionsa = request.getSession(false);
            String buyerid = (String) sessionsa.getAttribute("nationalid");
            String msgsent = "No";
            String itemdelivered = "No";

            TransactionClass transact = new TransactionClass(buyerid, sellerid, category,Brand ,datei, msgsent, itemdelivered,price);
            if (itemonsale != null) {
                session.delete(itemonsale);

            }
            session.save(transact);
            txn.commit();
            session.close();
            success = "Purchase was succesful. You are required to pick up the item in two days time failure to which the item will be on sale Thank you";
            request.setAttribute("success", success);

        } catch (Exception e) {
            response.sendRedirect("ShowGoods");

        } finally {
             request.getRequestDispatcher("ShowGoods").forward(request, response);
           

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
