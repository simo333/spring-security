package com.example.springsecurityjwt.repository;

import com.example.springsecurityjwt.domain.Role;
import com.example.springsecurityjwt.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
