package com.example.garden.service;

import com.example.garden.model.Plant;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PlantService {
    List<Plant> findAll();

    List<Plant> findAllOrderByName();
    List<Plant> findAllOrderByDate();
    Optional<Plant> findPlantByName(String name);

    Optional<Plant> addPlant(Plant garden);

    Optional<Plant> updatePlant(String name, Plant garden);

    void deleteByName(String name);

    void deleteAll();
}
