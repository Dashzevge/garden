package com.example.garden;

import com.example.garden.model.Garden;
import com.example.garden.model.Plant;
import com.example.garden.service.GardenService;
import com.example.garden.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class GardenApplication {

    @Autowired
    private GardenService gardenService;

    @Autowired
    private PlantService plantService;

    public static void main(String[] args) {
        SpringApplication.run(GardenApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            Garden garden1 = new Garden("Vegatable Patch", 50.0);
            Garden garden2 = new Garden("Herb Garden", 20.0);
            gardenService.addGarden(garden1);
            gardenService.addGarden(garden2);
            System.out.println(gardenService.findAll());

            Plant plant1 = new Plant("Tomato","Vegatable", LocalDate.of(2024,03,10), garden1);
            Plant plant2 = new Plant("Carrot","Vegatable",LocalDate.of(2024,02,10),garden1);
            Plant plant3 = new Plant("Basil","Herb",LocalDate.of(2024,04,05),garden2);
            plantService.addPlant(plant1);
            plantService.addPlant(plant2);
            plantService.addPlant(plant3);
            System.out.println(plantService.findAll());
        };
    }
}
