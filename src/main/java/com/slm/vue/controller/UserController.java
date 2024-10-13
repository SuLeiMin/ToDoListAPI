package com.slm.vue.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.slm.vue.model.User;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
//@CrossOrigin(origins = "http://localhost:8080") // Allows Vue.js front-end to make requests
public class UserController {

    private List<User> users = new ArrayList<>();
    
//    @PostMapping("/register")
//    public Response registerUser(@RequestBody User user) {
//        // Simple validation
//        if (user.getUsername().isEmpty() || user.getEmail().isEmpty() || user.getPassword().isEmpty()) {
//            return new Response("All fields are required!");
//        }
//
//        // Check if user already exists
//        for (User u : users) {
//            if (u.getEmail().equals(user.getEmail())) {
//                return new Response("User already exists!");
//            }
//        }
//
//        // Add user to the list (in real case, save to database)
//        users.add(user);
//
//        // Return success response
//        return new Response("User registered successfully!");
//    }
    
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        // Logic for user registration (e.g., save user to the database)
        return ResponseEntity.ok("User registered successfully!");
    }
}

// Response class for handling responses
class Response {
    private String message;

    public Response(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

