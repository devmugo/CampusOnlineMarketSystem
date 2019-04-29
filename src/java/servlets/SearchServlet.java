/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;



import factory.GetFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Upload;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;


/**
 *
 * @author AMO
 */
public class SearchServlet extends HttpServlet {
   

 public static SessionFactory factory = GetFactory.getFactory();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Session session = factory.openSession();
       
          try{  
         String searchkey = request.getParameter("search");
         
         Criteria criteria = session.createCriteria(Upload.class);
         criteria.add(Restrictions.eq("category", searchkey));
         List<Upload> searchresults = new ArrayList<>();
         searchresults = criteria.list();  
         session.close();
          for(Upload up : searchresults){
           byte[] img = up.getImage();
          String b64 = Base64.getEncoder().encodeToString(img);
          up.setB64(b64);
           }
          request.setAttribute("searchresults", searchresults);
          
          }
          catch(Exception e ){
                 } 
          finally{
          
            RequestDispatcher rd = request.getRequestDispatcher("SearchResult.jsp");
            rd.forward(request, response);
          }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
