/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import static com.itextpdf.kernel.xmp.PdfConst.Date;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import factory.GetFactory;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.DoneTransactions;
import models.Messages;
import models.Upload;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import static servlets.Reports.factory;

public class pdfReport extends HttpServlet {

    int totalearnings;
    public static SessionFactory factory = GetFactory.getFactory();
    Document document = new Document();
    String str = "pdf";
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    String dat = formatter.format(date);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        

        try {
            if (str.equals("pdf")) {
                response.setContentType("application/pdf");
                PdfWriter.getInstance(document, response.getOutputStream());
            }

            Session session = factory.openSession();
            //get number of transctions in a day
            String hql = "FROM DoneTransactions E where E.datedone= :dat";
            Query query = session.createQuery(hql);
            query.setParameter("dat", dat);
            List transaction = query.list();
            int trans = transaction.size();
            
            //no of uploads in a day
            hql = "FROM Upload E where E.date= :dat";
            query = session.createQuery(hql);
            query.setParameter("dat", dat);
            transaction = query.list();
            int uploads = transaction.size();

            // getting commision earned in a day
            hql = "SELECT E.commission FROM DoneTransactions E where E.datedone= :dat";
            query = session.createQuery(hql);
            query.setParameter("dat", dat);
            List results = query.list();
            int sum = ListUtil.sum(results);
            
            //geting number of phones sold
             hql = "SELECT E.commission FROM DoneTransactions E where E.datedone= :dat and E.category='smart phone' or E.category='phone'";
            query = session.createQuery(hql);
            query.setParameter("dat", dat);
            results = query.list();
            int phones = results.size();
            
             //geting number of laptops sold in a day
             hql = "SELECT E.commission FROM DoneTransactions E where E.datedone= :dat and E.category='laptop' or E.category='laptops'";
             query = session.createQuery(hql);
            query.setParameter("dat", dat);
            results = query.list();
            int laptops = results.size();
            
         
            
             //geting number of furniture sold in a day
             hql = "SELECT E.commission FROM DoneTransactions E where E.datedone= :dat and E.category='table' or E.category='bed'";
             query = session.createQuery(hql);
            query.setParameter("dat", dat);
            results = query.list();
            int furniture = results.size();
            
            //geting number of home appliances sold in a day
             hql = "SELECT E.commission FROM DoneTransactions E where E.datedone= :dat and E.category='woofer' or E.category='tv'";
             query = session.createQuery(hql);
            query.setParameter("dat", dat);
            results = query.list();
            int homeappliances = results.size();
            //getting other categories sold
            int others = trans - ( homeappliances + furniture + laptops + phones );
            
             HttpSession sessionsa = request.getSession(false);
             String user= (String) sessionsa.getAttribute("user");

          
                document.open();
                /* new paragraph instance initialized and add function write in pdf file*/
                document.add(new Paragraph("-------------------------------------------------Campus Markets Daily Report-----------------------------\n\n"));
                document.add(new Paragraph("                                                 REPORT  Created BY Admin " +  user  +" \n"));
                document.add(new Paragraph("                                                 Daily Summary \n"));
                document.add(new Paragraph("                                                 DATE " + "  " + dat + "\n"));
                document.add(new Paragraph("---------------------------------------------------------------------------------------------------------------------------------\n\n"));
                document.add(new Paragraph("                                                            "));
                document.add(new Paragraph("                                                            "));
                
                document.add(new Paragraph("Total sales................................  " + trans));
                document.add(new Paragraph("                                                            "));
                document.add(new Paragraph("Total Commission Earned  .......  " + sum));
                document.add(new Paragraph("                                                            "));
                document.add(new Paragraph("Number of Uploads today   ......  " + uploads));
                document.add(new Paragraph("                                                            "));
                
                PdfPTable table = new PdfPTable(2);
                table.setWidthPercentage(100);
                Font font = FontFactory.getFont(FontFactory.TIMES_BOLD, 12);
                PdfPCell cell = new PdfPCell(new Phrase("Item", font));

                cell.setBorder(Rectangle.BOX);
                table.addCell(cell);

                cell.setPhrase(new Phrase("Amounts Sold", font));
                table.addCell(cell);
                
                cell.setPhrase(new Phrase("phones" , font));
                table.addCell(cell);

                cell.setPhrase(new Phrase( Integer.toString(phones) , font));
                table.addCell(cell);
                
                 cell.setPhrase(new Phrase("laptops" , font));
                table.addCell(cell);

                cell.setPhrase(new Phrase( Integer.toString(laptops) , font));
                table.addCell(cell);
                
                cell.setPhrase(new Phrase("furniture" , font));
                table.addCell(cell);

                cell.setPhrase(new Phrase( Integer.toString(furniture) , font));
                table.addCell(cell);
        
                cell.setPhrase(new Phrase("Home Appliances" , font));
                table.addCell(cell);

                cell.setPhrase(new Phrase( Integer.toString(homeappliances) , font));
                table.addCell(cell);
                
                cell.setPhrase(new Phrase("Others" , font));
                table.addCell(cell);

                cell.setPhrase(new Phrase( Integer.toString(others) , font));
                table.addCell(cell);
                
                 document.add(table);
                 document.close();
           

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }



}
   