package com.example.world.controller;

import com.example.world.models.Admin;
import com.example.world.models.Customers;
import com.example.world.services.AdminService;
import com.example.world.services.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class AllController {
    
    @Autowired
    private CustomerService customerService;

    @Autowired
    private AdminService adminService;

    @PostMapping("/customer")
    public ResponseEntity<Customers> addCustomers(@RequestBody Customers customers) {
        System.out.println("______________________-----------------------_____________________");
        System.out.println(customers.toString());
        System.out.println("______________________-----------------------_____________________");
        return new ResponseEntity<>(customerService.addCustomers(customers),HttpStatus.CREATED);
    }

    @PostMapping("/admin")
    public ResponseEntity<Admin> addAdmin(@RequestBody Admin admin) {
        return new ResponseEntity<>(adminService.addAdmin(admin),HttpStatus.CREATED);
    }
    
}
