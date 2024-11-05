package com.example.garden.repository;

import com.example.garden.model.Garden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Indexed;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GardenRepository extends JpaRepository <Garden, Integer> {
    Optional<Garden> findByName(String name);
    void deleteGardensByName(String name);
}
