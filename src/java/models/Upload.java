/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author AMO
 */
@Entity
@Table(name = "Goods")
public class Upload {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int itemindex;
    
    private String nationalid;
    private String category;
    private String brand;
    @Lob
    @Column(nullable=false, columnDefinition="Longblob")
    private byte[] image;
    private String age;
    private String cond;
    private double price;
    @Transient
    private String b64;
    private Date date; 
    
    private String description;
    
    public String getB64() {
        return b64;
    }
    
public void setB64(String b64) {
        this.b64 = b64;
    }
    

    public Upload() {
    }

    public Upload(String nationalid, String category, String brand, byte[] image, String age, String cond, double price ,Date date,String description) {
        
        this.nationalid = nationalid;
        this.category = category;
        this.brand = brand;
        this.image = image;
        this.age = age;
        this.cond = cond;
        this.price = price;
        this.date= date;
        this.description= description;
    }

    public int getItemindex() {
        return itemindex;
    }

    public String getNationalid() {
        return nationalid;
    }

    public void setNationalid(String nationalid) {
        this.nationalid = nationalid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCond() {
        return cond;
    }

    public void setCond(String cond) {
        this.cond = cond;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Upload{" + "itemindex=" + itemindex + ", nationalid=" + nationalid + ", category=" + category + ", brand=" + brand + ", image=" + image + ", age=" + age + ", cond=" + cond + ", price=" + price + ", b64=" + b64 + ", date=" + date + ", description=" + description + '}';
    }
    
    
    
    
    
    
    
    
    
    
    

    
}
