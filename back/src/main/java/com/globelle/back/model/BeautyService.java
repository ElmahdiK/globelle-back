package com.globelle.back.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;

@Entity
@SuperBuilder
@Data
public class BeautyService implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String price;

    @Column(nullable = false)
    private String duration;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Categorie category;


    @ManyToOne
    @JoinColumn(name = "provider_id", nullable = false)
    private Provider provider;
}