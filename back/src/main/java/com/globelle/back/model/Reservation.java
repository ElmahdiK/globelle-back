package com.globelle.back.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Date;
import java.util.UUID;

@Entity
@SuperBuilder
@Data
public class Reservation {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Getter
    @Setter
    private UUID id;

    @Temporal(TemporalType.TIMESTAMP)
    @Getter
    @Setter
    private Date reservationDate;

    @Column(nullable = false)
    @Getter
    @Setter
    private String price;

    @Column(nullable = false)
    @Getter
    @Setter
    private String duration;

    @Column(nullable = false)
    @Getter
    @Setter
    private String paymentType;

}