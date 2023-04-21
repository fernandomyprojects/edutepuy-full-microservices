package com.edutepuy.college.controller;

import com.edutepuy.college.entity.TestEntity;
import com.edutepuy.college.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/college")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("test")
    public ResponseEntity<List<TestEntity>> getTests() {
        return new ResponseEntity<>(testService.getTests(), HttpStatus.OK);
    }
}
