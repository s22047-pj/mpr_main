package com.example.pjatkway.repository;
import com.example.pjatkway.enums.SandwitchSize;
import com.example.pjatkway.models.Ingredients;
import com.example.pjatkway.models.Sandwitch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public
interface SandwichRepository extends JpaRepository<Sandwitch, Integer> {
    List<Sandwitch> findAllByIdLessThan(Integer id);
}
