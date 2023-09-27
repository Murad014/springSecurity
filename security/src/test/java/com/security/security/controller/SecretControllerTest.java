package com.security.security.controller;


import com.security.security.entity.User;
//import com.security.security.service.CustomUserDetailsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(SecretController.class)
public class SecretControllerTest {
    @Autowired
    private MockMvc mockMvc;


    @Test
    public void getSecretInfoWithWrongUsernameOrPassword() throws Exception {

        mockMvc.perform(get("/api/v1/secret/info")
                        .with(SecurityMockMvcRequestPostProcessors.httpBasic("user", "user1231")))
                .andExpect(status().isUnauthorized());
    }




}
