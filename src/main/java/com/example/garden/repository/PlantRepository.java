package com.example.garden.repository;

import com.example.garden.model.Plant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface PlantRepository extends JpaRepository<Plant,Integer> {

    List<Plant> findAllByOrderByName();
   // @Query("select u from Plant u order by u.date")
    List<Plant> findAllByOrderByDate();
    Optional<Plant> findPlantByName(String Name);
    void deletePlantByName(String name);
}
