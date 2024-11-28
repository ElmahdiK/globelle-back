package com.globelle.back.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Entity
@SuperBuilder
@Data
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String reservationDate;

    @Column
    private Integer clientId;

    @Column
    private Integer providerId;
}