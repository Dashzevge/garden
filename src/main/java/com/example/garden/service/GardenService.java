package com.example.garden.service;

import com.example.garden.model.Garden;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface GardenService {

    List<Garden> findAll();
    Optional<Garden> findGardenByName(String name);
    Optional<Garden> addGarden(Garden garden);
    Optional<Garden> updateGarden(Garden garden);
    void deleteByName(String name);
    void deleteAll();
}
