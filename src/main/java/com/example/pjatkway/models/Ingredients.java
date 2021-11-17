package com.example.pjatkway.models;

import javax.persistence.*;

@Entity
@Table(name = "Ingredients")
public class Ingredients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Double price;
    private Integer calories;
    private Integer potassium;

    public Ingredients(Integer id, String name, Double price, Integer calories, Integer potassium) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.potassium = potassium;
    }

    public Ingredients() {
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

    public Integer getCalories() {
        return calories;
    }

    public Integer getPotassium() {
        return potassium;
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

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public void setPotassium(Integer potassium) {
        this.potassium = potassium;
    }
}
