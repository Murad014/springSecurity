package com.security.security.controller;

import com.security.security.entity.User;
import com.security.security.service.UserService;
import com.security.security.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Role;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/secret")
public class SecretController {

    private final UserService userService;

    @Autowired
    public SecretController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/info")
    public ResponseEntity<String> secretInfo(){
        return new ResponseEntity<>("This is secret page.", HttpStatus.OK);
    }

    @GetMapping("/users/{username}")
    public ResponseEntity<User> findByUsername(@PathVariable("username") String username) {
        return new ResponseEntity<>(userService.findByUsername(username), HttpStatus.OK);
    }


}
