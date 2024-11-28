package com.globelle.back.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.UUID;

@Entity
@SuperBuilder
@Data
public class BeautyService implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String price;

    @Column(nullable = false)
    private String duration;

    @Column(nullable = false)
    private Categorie categories;

    /*
    public BeautyService(UUID id, String name, String price, String duration, Categorie categories) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.duration = duration;
        this.categories = categories;
    }
    */
}