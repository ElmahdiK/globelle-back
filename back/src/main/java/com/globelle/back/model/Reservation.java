package com.globelle.back.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String reservationDate;
//
//    private Integer clientId;
//
//    private Integer providerId;
//
//    private Integer beautyServiceId;


    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "id", nullable = false)
    private User clientId;

    @ManyToOne
    @JoinColumn(name = "provider_id", referencedColumnName = "id", nullable = false)
    private User providerId;

    @ManyToOne
    @JoinColumn(name = "beauty_service_id", referencedColumnName = "id", nullable = false)
    private BeautyService beautyServiceId;
}