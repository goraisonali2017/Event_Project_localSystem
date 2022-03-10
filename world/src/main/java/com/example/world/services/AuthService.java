package com.example.world.services;

import com.example.world.models.Auth;
import com.example.world.repos.AuthRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    
    @Autowired
    private AuthRepo authRepo;
    
    public String doLogin(String email,String password) throws Exception{
        Auth auth = authRepo.findByEmail(email);
        if(auth == null){
            throw new Exception("User not found");
        }
        else if(!auth.getPassword().equals(password)){
            throw new Exception("Password is incorrect");
        }
        return auth.getId() + " " + auth.getRoles().toString() ;
    }
}
