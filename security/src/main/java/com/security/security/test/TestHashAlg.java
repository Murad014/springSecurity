package com.security.security.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class TestHashAlg {

    public static void main(String... args){
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String muradPassword = passwordEncoder.encode("user1231");
        String adminPassword = passwordEncoder.encode("admin1231");
        System.out.println("Murad password is " + muradPassword);
        System.out.println("Admin password is " + adminPassword);
    }


}
