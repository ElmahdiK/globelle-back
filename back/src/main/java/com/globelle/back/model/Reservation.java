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
    private UUID id;

    @Temporal(TemporalType.TIMESTAMP)
    @Getter
    private Date reservationDate;

    @Column(nullable = false)
    @Getter
    private String price;

    @Column(nullable = false)
    @Getter
    private String duration;

    @Column(nullable = false)
    @Getter
    private PaymentType paymentType;

    @Id
    @Getter
    private UUID clientId;

    @Id
    @Getter
    private UUID providerId;

    public Reservation(UUID id, Date reservationDate, String price, String duration,
                       PaymentType paymentType, UUID clientId, UUID providerId) {
        this.id = id;
        this.reservationDate = reservationDate;
        this.price = price;
        this.duration = duration;
        this.paymentType = paymentType;
        this.clientId = clientId;
        this.providerId = providerId;
    }

    public Reservation() {
    }
}