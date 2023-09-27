package com.security.security.controller;

import com.security.security.entity.User;
//import com.security.security.service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/secret")
public class SecretController {

    @GetMapping("/info")
    public ResponseEntity<String> secretInfo(){
        return new ResponseEntity<>("This is secret page.", HttpStatus.OK);
    }


}
