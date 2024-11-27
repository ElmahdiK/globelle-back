package com.globelle.back.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.UUID;

@Entity
@SuperBuilder
@Data
public class BeautyService implements Serializable {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Getter
    private UUID id;

    @Column(nullable = false)
    @Getter
    @Setter
    private String name;

    @Column(nullable = false)
    @Getter
    @Setter
    private String price;

    @Column(nullable = false)
    @Getter
    @Setter
    private String duration;

//    @Enumerated
    @Column(nullable = false)
    @Getter
    private Categories categories;

    public BeautyService(UUID id, String name, String price, String duration, Categories categories) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.duration = duration;
        this.categories = categories;
    }
}