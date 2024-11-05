package com.example.garden.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity(name = "plant")
@NoArgsConstructor
@Getter
@Setter
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Type")
    private String type;

    @Column(name = "Plant Date")
    private LocalDate date;

    @ManyToOne
    private Garden garden;

    public Plant(String name, String type, LocalDate date, Garden garden) {
        this.name = name;
        this.type = type;
        this.date = date;
        this.garden = garden;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", date=" + date +
                ", garden=" + garden +
                '}';
    }
}
