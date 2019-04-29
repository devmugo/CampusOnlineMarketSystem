/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;


import javax.persistence.Entity;
import javax.persistence.Id;


/**
 *
 * @author AMO
 */
@Entity

public class DoneTransactions  {
    
    @Id
    private int transid;
    private String datedone;
    private String Itemsold;
    private String sellerid;
    private String buyerid;

   
    public DoneTransactions( int transid,String datedone, String Itemsold, String sellerid, String buyerid) {
        this.transid= transid;
        this.datedone = datedone;
        this.Itemsold = Itemsold;
        this.sellerid = sellerid;
        this.buyerid = buyerid;
    }
     public DoneTransactions() {
    }

    public int getTransid() {
        return transid;
    }

    public void setTransid(int transid) {
        this.transid = transid;
    }

    

   
   

    public String getDatedone() {
        return datedone;
    }

    public void setDatedone(String datedone) {
        this.datedone = datedone;
    }

    public String getItemsold() {
        return Itemsold;
    }

    public void setItemsold(String Itemsold) {
        this.Itemsold = Itemsold;
    }

    public String getSellerid() {
        return sellerid;
    }

    public void setSellerid(String sellerid) {
        this.sellerid = sellerid;
    }

    public String getBuyerid() {
        return buyerid;
    }

    public void setBuyerid(String buyerid) {
        this.buyerid = buyerid;
    }

    @Override
    public String toString() {
        return "CompletedTransactions{" + "itemindex=" + transid + ", date=" + datedone + ", Itemsold=" + Itemsold + ", sellerid=" + sellerid + ", buyerid=" + buyerid + '}';
    }
    
    
    

    
    


 
    
}
