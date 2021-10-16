package com.example.pjatkway.models;
import com.example.pjatkway.enums.SandwitchSize;

import java.util.List;

public class Sandwitch {

    private Integer id;
    private String name;
    private Double price;
    private SandwitchSize size;
    private Double calories;
    private List<Ingredients> ingredients;

    public Sandwitch(){
    }

    public Sandwitch(Integer id, String name, Double price, SandwitchSize size, Double calories, List<Ingredients> ingredients) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.size = size;
        this.calories = calories;
        this.ingredients = ingredients;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public SandwitchSize getSize() {
        return size;
    }

    public Double getCalories() {
        return calories;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setSize(SandwitchSize size) {
        this.size = size;
    }

    public void setCalories(Double calories) {
        this.calories = calories;
    }

    public void setIngredients(List<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }
}
