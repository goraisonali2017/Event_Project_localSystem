package com.example.world.models;

import javax.persistence.Entity;

@Entity
public class Admin extends Users{

    public Admin() {
    }

    public Admin(String email, String password, String username, String mobileNo, String address) {
        super(email, password, username, mobileNo, address);
    }

    public Admin(String id, String email, String password, String username, String mobileNo, String address) {
        super(id, email, password, username, mobileNo, address);
    }
    
}
