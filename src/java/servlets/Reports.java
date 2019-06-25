/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import factory.GetFactory;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.DoneTransactions;
import models.Messages;
import models.Upload;
import models.Users;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;



public class Reports extends HttpServlet {

    int totalearnings;
    public static SessionFactory factory = GetFactory.getFactory();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//fetch items in the database
        try{
        Session session = factory.openSession();
        Criteria criteria = session.createCriteria(Upload.class);
        List<Upload> alluploads = new ArrayList<>();
        alluploads = criteria.list();
         int no_of_items = alluploads.size();
         
         //fetch done transactions
         criteria = session.createCriteria(DoneTransactions.class);
        List<DoneTransactions> dt = new ArrayList<>();
        dt = criteria.list();
        int done_tr = dt.size();
        
        //featch no of messages
        criteria = session.createCriteria(Messages.class);
        List<Messages> msgs  = new ArrayList<>();
        msgs = criteria.list();
        int no_of_msgs = msgs.size();
        
        //fetch commissions earned
        String hql = "SELECT E.commission FROM DoneTransactions E";
        Query query = session.createQuery(hql);
        List results = query.list();
        
        int sum = ListUtil.sum(results);
        //getting sales by category
        hql = "FROM Upload E where E.category='smart phone' ";
        query = session.createQuery(hql);
        List smr = query.list();
        int smphnes = smr.size();
        
        //no of laptops
        hql = "FROM Upload E where E.category='laptop' ";
        query = session.createQuery(hql);
        List lapi = query.list();
        int nol = lapi.size();
        
        //furniture
        hql = "FROM Upload E where E.category='bed' or E.category='chair' ";
        query = session.createQuery(hql);
        List fntr = query.list();
        int nof = fntr.size();
        //home appliances
        hql = "FROM Upload E where E.category='woofer' or E.category='tv' ";
        query = session.createQuery(hql);
        List ha = query.list();
        int noh = ha.size();
        //stationary
        hql = "FROM Upload E where E.category='books' or E.category='printer' ";
        query = session.createQuery(hql);
        List  stn= query.list();
        int nos = stn.size();
        
        int others = (no_of_items-(nos+noh+nof+nol+smphnes));
        //getting no of sales made on items
        hql = "FROM DoneTransactions E where E.category='laptop' ";
        query = session.createQuery(hql);
        List  lap= query.list();
        int nold = lap.size();
        
         hql = "FROM DoneTransactions E where E.category='smart phone' or E.category='phone' ";
        query = session.createQuery(hql);
        List  sp= query.list();
        int nosp = sp.size();
        
        int othersd = (done_tr-(nosp+nold));
        System.out.println("Stationeries  "  + nos);
        
       request.setAttribute("tm",no_of_items);
       request.setAttribute("dt",done_tr);
       request.setAttribute("msgs",no_of_msgs);
       request.setAttribute("dt",done_tr);
       request.setAttribute("sum",sum);
        request.setAttribute("nostationary",nos);
       request.setAttribute("nofsmrtp",smphnes);
       request.setAttribute("goodsothers",others);
       request.setAttribute("noflaptop",nol);
       request.setAttribute("nofurniture", nof );
       request.setAttribute("woofers",noh);
       request.setAttribute("laptopdone",nold );
       request.setAttribute("smrtphonedone",nosp);
       request.setAttribute("doneothers",othersd);
       session.close(); 
        }
        
        catch (Exception e){
        }
        finally{
             RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
        rd.forward(request, response);
        
        }
      
      
      

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
class ListUtil{

    public static int sum(List<Integer> list){
      if(list==null || list.size()<1)
        return 0;

      int sum = 0;
      for(Integer i: list)
        sum = sum+i;

      return sum;
    }
}
