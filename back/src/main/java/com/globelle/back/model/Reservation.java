package com.globelle.back.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@SuperBuilder
@Data
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private UUID id;

    /*
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date reservationDate;
    */
    @Column
    private String reservationDate;

    //@Id
    @Column
    private UUID clientId;

    //@Id
    @Column
    private UUID providerId;

    public Reservation(UUID id, String reservationDate, UUID clientId, UUID providerId) {
        this.id = id;
        this.reservationDate = reservationDate;
        this.clientId = clientId;
        this.providerId = providerId;
    }

    public Reservation() {
    }
}