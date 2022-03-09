package com.example.world.services;

import java.util.Optional;

import com.example.world.models.Admin;
import com.example.world.repos.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    
    @Autowired
    private AdminRepo adminRepo;
    
    public Admin addAdmin(Admin admin) {
        return adminRepo.save(admin);
    }
   
    public Optional<Admin> getAdminByEmail(String email) {
        return adminRepo.findByEmail(email);
    }

}
