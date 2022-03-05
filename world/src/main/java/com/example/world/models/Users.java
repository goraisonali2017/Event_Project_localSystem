package com.example.world.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.Id;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Users {

    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String id;
    private String email;
    private String password;
    private String username;
    private String mobileNo;
    private String address;
    
    public Users() {
    }

    public Users(String email, String password, String username, String mobileNo, String address) {
        this.email = email;
        this.password = password;
        this.username = username;
        this.mobileNo = mobileNo;
        this.address = address;
    }

    public Users(String id, String email, String password, String username, String mobileNo, String address) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.username = username;
        this.mobileNo = mobileNo;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Users [address=" + address + ", email=" + email + ", id=" + id + ", mobileNo=" + mobileNo
                + ", password=" + password + ", username=" + username + "]";
    }
        
}
