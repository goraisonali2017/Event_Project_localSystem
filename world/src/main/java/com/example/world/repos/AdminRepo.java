package com.example.world.repos;

import com.example.world.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin,String>{
    
}
