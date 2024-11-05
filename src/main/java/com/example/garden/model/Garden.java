package com.example.garden.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.nio.MappedByteBuffer;
import java.util.List;

@Entity(name = "garden")
@NoArgsConstructor
@Getter
@Setter
public class Garden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "size")
    private double size;

    public Garden(String name, double size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Garden{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
