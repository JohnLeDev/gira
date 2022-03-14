package com.anlecybersoft.gira.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class WelComeController {
    @GetMapping
    public Object welcome() {
        return new ResponseEntity<>("Hello welcome", HttpStatus.OK);
    }
    
}
