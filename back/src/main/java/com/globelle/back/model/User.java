package com.globelle.back.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@MappedSuperclass
abstract class User  implements Serializable {
    @Id
    /*@GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )*/
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String postalCode;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String telephone;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @Column(nullable = false)
    private boolean blacklisted;

    @Lob
    private byte[] profilePhoto;

    @OneToMany
    private List<Reservation> reservationsList = new ArrayList<>();

    public User(Integer id, String name, String surname, String email,
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
