package com.edutepuy.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/demo-controller")
@CrossOrigin(origins = "http://localhost:8100/")
public class DemoController {

  @GetMapping
  public ResponseEntity<Map<String, String>> sayHello() {
    Map<String, String> map = new HashMap<>();
    map.put("msn", "Hello from secured endpoint");
    return ResponseEntity.ok(map);
  }

}
