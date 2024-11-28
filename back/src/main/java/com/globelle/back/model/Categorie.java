package com.globelle.back.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Data
public class Categorie implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Getter
    private Integer id;

    @Column(nullable = false)
    @Getter
    private String categorieService;

    public Categorie(Integer id, String categorieService) {
        this.id = id;
        this.categorieService = categorieService;
    }

    public Categorie() {
    }
}
