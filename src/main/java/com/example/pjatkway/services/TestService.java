package com.example.pjatkway.services;
import com.example.pjatkway.enums.SandwitchSize;
import com.example.pjatkway.models.Ingredients;
import com.example.pjatkway.models.Sandwitch;
import com.example.pjatkway.repository.SandwichRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestService {

    private final SandwichRepository sandwichRepository;

    public TestService(SandwichRepository sandwichRepository) {
        this.sandwichRepository = sandwichRepository;

    }

    public Sandwitch createSandwitch(){
        List<Ingredients> ingredients = new ArrayList<>();
        Ingredients bread = new Ingredients(null, "white_name", 5.0, 100, 1);
        Sandwitch poor = new Sandwitch(null, "poor", 5.0, SandwitchSize.SMALL, 100.0, List.of(bread));
        return poor;
    }

    public Sandwitch createSandwitchName(String name){
        Ingredients bread = new Ingredients(null, "name", 5.0, 100, 1);
        Sandwitch poor = new Sandwitch(null, name, 5.0, SandwitchSize.SMALL, 100.0, List.of(bread));
        // sandwichRepository.save(poor);
        poor.setName("Temp name");
        return sandwichRepository.save(poor);
    }

    public List<Sandwitch> getFiveSandwich(){
        return sandwichRepository.findAllByIdLessThan(5);
    }
}
