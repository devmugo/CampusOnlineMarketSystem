/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Beans.Emailbean;
import factory.GetFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.TransactionClass;
import models.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import static servlets.MailServlet.factory;

/**
 *
 * @author AMO
 */
public class SendLinkServlet extends HttpServlet {

    @EJB
    private Emailbean mailsender;

    public static SessionFactory factory = GetFactory.getFactory();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Session session = factory.openSession();
        String email = request.getParameter("email");
        Users user = (Users) session.get(Users.class, email);
        if (user == null) {

            String error = "NO such email adress found";
            request.setAttribute("error", error);
            request.getRequestDispatcher("confirmEmail.jsp").forward(request, response);
        } else {

            try {
              
                 String message = "follow this link to reset your password \n <a href='http://localhost:8080/CampusOnlineMarketSystem/Changepassoword.jsp?email=" + email +  " '>Reset password </a>";
              
                try {
                    String subject = "Campus market reset passwords";
                    final String from = "mugomwash@gmail.com";
                    final String password = "mibmusavpexjnvxm";
                    final String username = "mugomwash@gmail.com";

                    Properties props = System.getProperties();
                    props.put("mail.smtp.host", "smtp.gmail.com");
                    props.put("mail.smtp.auth", "true");
                    props.put("mail.smtp.port", "465");
                    props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
                    props.put("mail.smtp.socketFactory.port", "465");
                    props.put("mail.smtp.socketFactory.fallback", "false");

                    javax.mail.Session mailsn = javax.mail.Session.getDefaultInstance(props, null);
                    mailsn.setDebug(true);
                    Message msg = new MimeMessage(mailsn);
                    msg.setFrom(new InternetAddress(from));
                    msg.setRecipient(Message.RecipientType.TO, new InternetAddress(email));
                    msg.setContent(message, "text/html");
                    msg.setSubject(subject);

                    Transport transport = mailsn.getTransport("smtp");
                    transport.connect("smtp.gmail.com", username, password);
                    transport.sendMessage(msg, msg.getAllRecipients());
                    session.close();
                    String messag = "Link sent to your email please check .Your email and reset your password";
                    request.setAttribute("message", messag);
                    request.getRequestDispatcher("confirmEmail.jsp").forward(request, response);
                    session.close();
                    
                } //end of send mail try block
                catch (Exception ex) {
                    Logger.getLogger(Emailbean.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("Bean Error " + ex.getMessage());
                    request.getRequestDispatcher("confirmEmail.jsp").forward(request, response);
                    String error= "no network";
                    request.setAttribute("error", error);
                    session.close();
                    
                }

            } // end of whole code try block 
            catch (Exception e) {
                System.out.println("message not sent");
                String error = "Error ";
                request.setAttribute("error", error);
                System.out.println(e.getMessage());
                session.close();
                request.getRequestDispatcher("confirmEmail.jsp").forward(request, response);

            }

        }

    }
    

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
