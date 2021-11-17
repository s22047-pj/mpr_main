package com.example.pjatkway.controllers;

import com.example.pjatkway.models.Sandwitch;

import com.example.pjatkway.services.TestService;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sandwich")
public class SandwitchRestController {
    private final TestService testService;

    public SandwitchRestController(TestService testService) {
        this.testService = testService;
    }
    @RequestMapping("/example")
    public ResponseEntity<Sandwitch> getExampleSandwitch(){
        Sandwitch sandwitch = testService.createSandwitch();
        return ResponseEntity.ok(sandwitch);
    }
    @RequestMapping("/example_two")
    public ResponseEntity<Sandwitch> mySandwitch(){
        Sandwitch sandwitch = testService.createSandwitchName("NEW_NAME");
        return ResponseEntity.ok(sandwitch);
    }

    @RequestMapping("/top_five")
    public ResponseEntity<List<Sandwitch>> getFiveRecords(){
        return ResponseEntity.ok(testService.getFiveSandwich());
    }
}
