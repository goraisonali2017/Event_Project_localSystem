package com.example.world.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import com.example.world.models.Admin;
import com.example.world.models.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class SecurityImpl implements UserDetailsService{

    @Autowired
    private CustomerService customerService;

    @Autowired
    private AdminService adminService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Customers> customer = customerService.getCustomerByEmail(username);
        Optional<Admin> admin = adminService.getAdminByEmail(username);
        
        if(customer.isPresent()) {
            Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority("ROLE_CUSTOMER"));
            return new User(customer.get().getEmail(), customer.get().getPassword(), authorities);            
        }
        else if(admin.isPresent()) {
            Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
            return new User(admin.get().getEmail(), admin.get().getPassword(), authorities);
        }
        else {
            throw new UsernameNotFoundException("User not found");
        }
    }
    
}
