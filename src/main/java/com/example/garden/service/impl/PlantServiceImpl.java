package com.example.garden.service.impl;

import com.example.garden.model.Plant;
import com.example.garden.repository.PlantRepository;
import com.example.garden.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlantServiceImpl implements PlantService {

    @Autowired
    private PlantRepository plantRepository;

    public List<Plant> findAll() {
        return plantRepository.findAll();
    }

    public List<Plant> findAllOrderByName(){
        return plantRepository.findAllByOrderByName();
    }

    public List<Plant> findAllOrderByDate(){
        return plantRepository.findAllByOrderByDate();
    }

    @Override
    public Optional<Plant> findPlantByName(String name) {
        return plantRepository.findPlantByName(name);
    }

    @Override
    public Optional<Plant> addPlant(Plant garden) {
        return Optional.of(plantRepository.save(garden));
    }

    @Override
    public Optional<Plant> updatePlant(String name, Plant garden) {
        return Optional.of(plantRepository.save(garden));
    }

    @Override
    public void deleteByName(String name) {
        plantRepository.deletePlantByName(name);
    }

    @Override
    public void deleteAll() {
        plantRepository.deleteAll();
    }
}
