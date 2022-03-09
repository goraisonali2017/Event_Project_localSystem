package com.example.world.repos;

import java.util.Optional;

import com.example.world.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin, String> {

    Optional<Admin> findByEmail(String email);

}
