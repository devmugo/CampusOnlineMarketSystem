/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;
//this class stores messages sent by users and retrieves them
import static Beans.UploadBean.factory;
import factory.GetFactory;
import java.util.ArrayList;
import java.util.List;
import models.Messages;
import models.Upload;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author AMO
 */
public class ContactBean {
    public static SessionFactory factory = GetFactory.getFactory();
    
    public List<Messages> GetMessages(){
        Session session = factory.openSession();
         Criteria criteria = session.createCriteria(Messages.class);
        List<Messages> message = new ArrayList<>();
        message = criteria.list();
        session.close();
       return message;
        
    }
    
    
}
