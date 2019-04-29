/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;
//this class sends mail to the sellers

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author AMO
 */
@Stateless
public class Emailbean {

  public void sendmail( String toemail,String message,String Subject){
      
      try {
          final String from ="mugomwash@gmail.com";
          final String password="AMOSMUGOMWANGI";
          final String username="Amos Mugo";
          
          Properties props = System.getProperties();
          props.put("mail.smtp.host","smtp.gmail.com");
          props.put("mail.smtp.auth","true");
          props.put("mail.smtp.port","465");
          props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
          props.put("mail.smtp.socketFactory.port","465");
          props.put("mail.smtp.socketFactory.fallback","false");
          
          Session mailsn = Session.getDefaultInstance(props, null);
          mailsn.setDebug(true);
          Message msg = new MimeMessage(mailsn);
          msg.setFrom(new InternetAddress(from));
          msg.setRecipient(Message.RecipientType.TO,new InternetAddress(toemail));
          msg.setContent(message,"text/html");
          msg.setSubject(Subject);
          
          Transport transport = mailsn.getTransport("smtp");
          transport.connect("smtp.gmail.com",username,password);
          transport.sendMessage(msg,msg.getAllRecipients());
          
          
          
          
      } catch (Exception ex) {
          Logger.getLogger(Emailbean.class.getName()).log(Level.SEVERE, null, ex);
               System.out.println("Bean Error " + ex.getMessage());
      }
     
     
     
     
     
  }
}
