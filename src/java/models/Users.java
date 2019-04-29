/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author AMO
 */
@Entity
public class Users  {
   @Id
    @Column(name = "email", length = 50, nullable = false)
    private String email;
      
    @Column(name = "nationalId", length = 8,unique=true)
    private String nationalId;
    
    @Column(name = "firstName", length = 20, nullable = false)
    private String firstName;
    
    @Column(name = "lastname", length = 20, nullable = false)
    private String lastName;
    
    @Column(name = "phone", length = 20, nullable = false)
    private String phone;
    
    
    @Column(name = "residence", length = 40, nullable = false)
    private String residence;
    
    @Column(name = "password", length = 20, nullable = false)
    private String pwencrypt;

    public Users() {
    }

    public Users(String nationalId, String firstName, String lastName, String phone, String email, String residence, String pwencrypt) {
        this.nationalId = nationalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.pwencrypt = pwencrypt;
        this.residence = residence;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getPwencrypt() {
        return pwencrypt;
    }

    public void setPwencrypt(String pwencrypt) {
        this.pwencrypt = pwencrypt;
    }

    @Override
    public String toString() {
        return "User{" + "nationalId=" + nationalId + ", firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone + ", email=" + email + ", residence=" + residence + ", pwencrypt=" + pwencrypt + '}';
    }

}
