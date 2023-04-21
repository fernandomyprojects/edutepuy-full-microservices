package com.edutepuy.controllers;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class DemoControllerTest {

    private static final String ACCESS_TOKEN = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZXJuYW5kby5qZXN1c0BnbWFpbC5jb20iLCJpYXQiOjE2ODIwNjgzODgsImV4cCI6MTY4MjA2OTgyOH0.vodrZY-MbUM8kvFjXBCe1Pz_KRbSGVePdgCdWu1CvN0";

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testResponseDemo() throws Exception {

        Map<String, String> map = new HashMap<>();
        map.put("msn", "Hello from secured endpoint");

        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/demo-controller")
                        .header("Authorization", "Bearer " + ACCESS_TOKEN)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();

        assertEquals(map, result.getResponse().getContentAsString());

    }
}