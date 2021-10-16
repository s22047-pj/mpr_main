package com.example.pjatkway.controllers;

import com.example.pjatkway.enums.SandwitchSize;
import com.example.pjatkway.models.Ingredients;
import com.example.pjatkway.models.Sandwitch;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sandwitch")
public class SandwitchRestController {

    @RequestMapping("/example")
    public ResponseEntity<Sandwitch> getExampleSandwitch(){
        Ingredients bread = new Ingredients(null, "white_name", 5.0, 100, 1);
        Sandwitch poor = new Sandwitch(null, "poor", 5.0, SandwitchSize.SMALL, 100.0, List.of(bread));

        return ResponseEntity.ok(poor);
    }
}
