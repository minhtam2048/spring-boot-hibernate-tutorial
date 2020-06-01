package com.example.springauth.demo.repository;

import com.example.springauth.demo.models.ERole;
import com.example.springauth.demo.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(ERole name);
}
