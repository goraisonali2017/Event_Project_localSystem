package com.example.world.repos;

import com.example.world.models.Auth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepo extends JpaRepository<Auth,String>{

    Auth findByEmail(String email);
    
}
