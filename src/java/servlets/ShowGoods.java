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
public class ShowGoods extends HttpServlet {
    //create an instanceof the upload bean class 
    UploadBean uploadbean = new UploadBean();
    

   
   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         try {
        
        List<Upload> goods = new ArrayList<>();
        goods = uploadbean.findUploads();
        for(Upload up : goods){
          byte[] img = up.getImage();
          String b64 = Base64.getEncoder().encodeToString(img);
          up.setB64(b64);
         
      }
        //System.out.println(goods.toString());
        request.setAttribute("goods", goods);
        
            
      } 
          catch (Exception e) {
         
       
       }
         finally{
           RequestDispatcher rd = request.getRequestDispatcher("ViewGoods.jsp");
        rd.forward(request, response);
         
         
         }
         
      
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
