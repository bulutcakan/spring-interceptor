package com.bulut.inceptorexample.controller;

import com.bulut.inceptorexample.model.SampleDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public ResponseEntity inteceptorTest() {
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

    @PostMapping
    public ResponseEntity checkAdvice(@RequestBody SampleDTO sampleDTO) {
        return new ResponseEntity(sampleDTO, HttpStatus.ACCEPTED);
    }
}
