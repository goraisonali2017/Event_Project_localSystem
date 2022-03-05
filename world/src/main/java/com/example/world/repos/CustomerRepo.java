package com.example.world.repos;

import java.util.Optional;

import com.example.world.models.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customers,String> {

    Optional<Customers> findByEmail(String email);
    
}
