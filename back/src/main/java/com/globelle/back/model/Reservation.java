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

    /*
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date reservationDate;
    */

    @Column
    private String reservationDate;

    //@Id
    @Column
    private Integer clientId;

    //@Id
    @Column
    private Integer providerId;

    public Reservation(Integer id, String reservationDate, Integer clientId, Integer providerId) {
        this.id = id;
        this.reservationDate = reservationDate;
        this.clientId = clientId;
        this.providerId = providerId;
    }

    public Reservation() {
    }
}