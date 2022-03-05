package com.example.world.services;

import java.util.Optional;

import com.example.world.models.Customers;
import com.example.world.repos.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    
    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Customers addCustomers(Customers customers) {
        customers.setPassword(passwordEncoder.encode(customers.getPassword()));
        return customerRepo.save(customers);
    }

    public Optional<Customers> getCustomerByEmail(String email) {
        return customerRepo.findByEmail(email);
    }

   
}
