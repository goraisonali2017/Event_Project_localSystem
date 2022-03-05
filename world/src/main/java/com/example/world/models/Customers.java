package com.example.world.models;

import javax.persistence.Entity;

@Entity
public class Customers extends Users{

    public Customers() {
    }

    public Customers(String email, String password, String username, String mobileNo, String address) {
        super(email, password, username, mobileNo, address);
    }

    public Customers(String id, String email, String password, String username, String mobileNo, String address) {
        super(id, email, password, username, mobileNo, address);
    }
    
    
}
