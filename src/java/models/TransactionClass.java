/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author AMO
 */
@Entity
@Table(name = "Transactions")
public class TransactionClass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int transactionId;
    @Column(nullable=true)
    private String buyerid;
    private String sellerid;
    private String itemsold;
    private String idate;
    private String msgsent;
   private String itemdelivered;
   private Double  price;

    public TransactionClass() {
    }

    public TransactionClass(String sellerid, String buyerid, String itemsold, String idate,String msgsent,String itemdelivered,Double price) {
        
        this.buyerid = buyerid;
        this.sellerid = sellerid;
        this.itemsold = itemsold;
        this.idate = idate;
        this.msgsent=msgsent;
         this.itemdelivered = itemdelivered;
         this.price=price;
    }

   
    public int getTransactionId() {
        return transactionId;
    }

  
    public String getBuyerid() {
        return buyerid;
    }

    public void setBuyerid(String buyerid) {
        this.buyerid = buyerid;
    }

    public String getSellerid() {
        return sellerid;
    }

    public void setSellerid(String sellerid) {
        this.sellerid = sellerid;
    }

    public String getItemsold() {
        return itemsold;
    }

    public void setItemsold(String itemsold) {
        this.itemsold = itemsold;
    }

    public String getDate() {
        return idate;
    }

    public void setDate(String date) {
        this.idate = date;
    }
     public String getMsgsent() {
        return msgsent;
    }

    public void setMsgsent(String msgsent) {
        this.msgsent = msgsent;
    }

    public String getItemdelivered() {
        return itemdelivered;
    }

    public void setItemdelivered(String itemdelivered) {
        this.itemdelivered = itemdelivered;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TransactionClass{" + "transactionId=" + transactionId + ", buyerid=" + buyerid + ", sellerid=" + sellerid + ", itemsold=" + itemsold + ", date=" + idate + ", msgsent=" + msgsent + ", itemdelivered=" + itemdelivered + ", price=" + price + '}';
    }
    

   
    
    
     

    

   
    
    

  
    
}
