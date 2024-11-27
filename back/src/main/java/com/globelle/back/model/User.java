package com.globelle.back.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@MappedSuperclass
abstract class User  implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    @Getter
    private UUID id;

    @Column(nullable = false)
    @Getter
    @Setter
    private String name;

    @Column(nullable = false)
    @Getter
    @Setter
    private String surname;

    @Column(nullable = false, unique = true)
    @Getter
    @Setter
    private String email;

    @Column(nullable = false)
    @Getter
    @Setter
    private String password;

    @Column(nullable = false)
    @Getter
    @Setter
    private String postalCode;

    @Column(nullable = false)
    @Getter
    @Setter
    private String city;

    @Column(nullable = false)
    @Getter
    @Setter
    private String address;

    @Column(nullable = false)
    @Getter
    @Setter
    private String telephone;

    @Temporal(TemporalType.TIMESTAMP)
    @Getter
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Getter
    @Setter
    private Date updatedAt;

    @Column(nullable = false)
    @Getter
    @Setter
    private boolean blacklisted;

    @Lob
    @Getter
    @Setter
    private byte[] profilePhoto;

    @OneToMany
    private List<Reservation> reservationsList = new ArrayList<>();

    public User(UUID id, String name, String surname, String email,
                String password, String postalCode, String city,
                String address, String telephone) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.postalCode = postalCode;
        this.city = city;
        this.address = address;
        this.telephone = telephone;
        this.createdAt = new Date();
    }

    public User() {
    }
}
