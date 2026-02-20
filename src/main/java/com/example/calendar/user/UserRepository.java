package com.example.calendar.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
//I fix the bug of the project
public interface UserRepository  extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);
}
