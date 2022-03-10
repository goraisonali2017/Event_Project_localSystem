package com.example.world.services;

import java.util.List;
import com.example.world.models.Customer;
import com.example.world.repos.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    
    @Autowired
    private CustomerRepo customerRepo;
    

    public Customer addCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }
    
}
