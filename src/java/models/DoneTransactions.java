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
    private Double price;
    private int amountpaid;
    private int commission;

     public DoneTransactions() {
    }
    public DoneTransactions( int transid,String datedone, String Itemsold, String sellerid, String buyerid,double price,int amountpaid,int commission) {
        this.transid= transid;
        this.datedone = datedone;
        this.Itemsold = Itemsold;
        this.sellerid = sellerid;
        this.buyerid = buyerid;
        this.price=price;
        this.amountpaid=amountpaid;
        this.commission=commission;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getAmountpaid() {
        return amountpaid;
    }

    public void setAmountpaid(int amountpaid) {
        this.amountpaid = amountpaid;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    @Override
    public String toString() {
        return "DoneTransactions{" + "transid=" + transid + ", datedone=" + datedone + ", Itemsold=" + Itemsold + ", sellerid=" + sellerid + ", buyerid=" + buyerid + ", price=" + price + ", amountpaid=" + amountpaid + ", commission=" + commission + '}';
    }
    

    

    
    
    

    
    


 
    
}
