package com.globelle.back.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.UUID;

@Entity
@SuperBuilder
@Data
public class BeautyServices implements Serializable {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Getter
    @Setter
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

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @Getter
    @Setter
    private Categories categories;

    public BeautyServices(UUID id, String name, String price, String duration, Categories categories) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.duration = duration;
        this.categories = categories;
    }
}
