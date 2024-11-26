package com.globelle.back.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class Categorie implements Serializable {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nom;

    public Integer getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
