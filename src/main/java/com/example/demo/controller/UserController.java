package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/api/v1/user")
@RestController
public class UserController {

    @GetMapping
    public ResponseEntity<?> getUserId() {
        String userId = "82223053";
        return ResponseEntity.ok(userId);
    }
}
