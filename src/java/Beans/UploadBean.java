/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import factory.GetFactory;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import models.Upload;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author AMO
 */
public class UploadBean {
    //this class retrieves all the uploads fromthe db 
   
      public static SessionFactory factory = GetFactory.getFactory();
       //retrieves all the uploads from the database
       public List<Upload> findUploads(){
     // Open a session
     Session session = factory.openSession();
     //retrieve all the goods from the database
      Criteria criteria = session.createCriteria(Upload.class);
      List<Upload> uploads = new ArrayList<>();
      
      for(Upload up : uploads){
          byte[] img = up.getImage();
          String b64 = Base64.getEncoder().encodeToString(img);
          System.out.println("B64 = "+b64);
          up.setB64(b64);
          System.out.println(up);
      }
      
      uploads = criteria.list();     
     
      session.close();
      return uploads;
       
       
       }
    
    
}
