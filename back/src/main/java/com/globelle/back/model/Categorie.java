package com.globelle.back.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Entity
@SuperBuilder
@Data
public class Categorie {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Getter
    private UUID id;

    @Column(nullable = false)
    @Getter
    private String categorieService;

    public Categorie(UUID id, String categorieService) {
        this.id = id;
        this.categorieService = categorieService;
    }

    public Categorie() {
    }
}
