/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Beans.UploadBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Upload;

/**
 *
 * @author AMO
 */
public class Home extends HttpServlet {
   
    UploadBean uploadbean = new UploadBean();
    

   
   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String mesage ="  ";
        
         try {
        
        List<Upload> goods = new ArrayList<>();
        goods = uploadbean.findUploads();
        int length = goods.size();
       
        for(Upload up : goods){
          byte[] img = up.getImage();
          String b64 = Base64.getEncoder().encodeToString(img);
          up.setB64(b64);
        
         
      }
         request.setAttribute("goods", goods);
       
        
     if(length>8){
         List <Upload> sublist = goods.subList(length-8,length);
          request.setAttribute("sublist", sublist);
        
     }
     else{
         List <Upload> sublist = goods;
         request.setAttribute("sublist", sublist);
         }
     
     
        
            
      } 
          catch (Exception e) {
         
       
       }
         finally{
           RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
        rd.forward(request, response);
         
         
         }
         
      
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
