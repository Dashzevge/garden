package com.example.garden.service.impl;

import com.example.garden.model.Garden;
import com.example.garden.repository.GardenRepository;
import com.example.garden.service.GardenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GardenServiceImpl implements GardenService {

    @Autowired
    private GardenRepository gardenRepository;

    @Override
    public List<Garden> findAll() {
        return gardenRepository.findAll();
    }

    @Override
    public Optional<Garden> findGardenByName(String name) {
        return gardenRepository.findByName(name);
    }

    @Override
    public Optional<Garden> addGarden(Garden garden) {
        return Optional.of(gardenRepository.save(garden));
    }

    @Override
    public Optional<Garden> updateGarden(Garden garden) {
        if(gardenRepository.findByName(garden.getName()).isPresent()) {
          return Optional.of(gardenRepository.save(garden));
       }
        return Optional.empty();
    }

    @Override
    public void deleteByName(String name) {
         gardenRepository.deleteGardensByName(name);
    }

    @Override
    public void deleteAll() {
        gardenRepository.deleteAll();
    }
}
