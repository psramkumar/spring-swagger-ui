package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test1")
public class TestApplicationController {
    
    @GetMapping("")
    public ResponseEntity<String> getApiResponse(){
        return ResponseEntity.ok("Demo 1 Controlled");
    }
}
