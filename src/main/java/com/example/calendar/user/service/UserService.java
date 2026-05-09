package com.example.calendar.user.service;

import com.example.calendar.user.entity.User;
import com.example.calendar.user.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class UserService {

    // Repository used to interact with the database
    private final UserRepository userRepository;

    // Password encoder for hashing user passwords before saving
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    // Constructor-based dependency injection
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Register a new user
     *
     * @param user the user object received from the request body
     * @return the saved user entity
     */
    public User register(User user) {

        // 🔍 Check if the email already exists in the database
        if (userRepository.existsByEmail(user.getEmail())) {

            // ❗ Throw a 400 Bad Request instead of 500 Internal Server Error
            // This is a business validation error (duplicate email), not a server failure
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "Email already exists"
            );
        }

        //  Encrypt the user's password before saving
        // This ensures security by not storing plain text passwords
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        //  Save the user to the database and return the saved entity
        return userRepository.save(user);
    }

    public User login(String email, String password) {

        Optional<User> userOptional = userRepository.findByEmail(email);

        if (userOptional.isEmpty()) {
            throw new ResponseStatusException(
                    HttpStatus.UNAUTHORIZED,
                    "Invalid email or password"
            );
        }

        User user = userOptional.get();

        boolean matches = passwordEncoder.matches(
                password,
                user.getPassword()
        );

        if (!matches) {
            throw new ResponseStatusException(
                    HttpStatus.UNAUTHORIZED,
                    "Invalid email or password"
            );
        }

        return user;
    }
}