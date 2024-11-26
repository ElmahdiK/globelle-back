package com.globelle.back.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Entity
@SuperBuilder
@Data
public class Provider extends User implements Serializable {

    @Column
    @Getter
    @Setter
    private String languages;

    @Column
    @Getter
    @Setter
    private String description;

    @OneToMany
    private List<BeautyServices> beautyServicesList = new ArrayList<>();

    @OneToMany
    private List<Reservation> reservations = new ArrayList<>();


    public Provider(UUID id, String name, String surname, String email, String password,
                    String postalCode, String city, String address, String telephone,
                    Date createdAt, Date updatedAt, boolean blacklisted, byte[] profilePhoto,
                    String languages, String description, List<BeautyServices> beautyServicesList,  List<Reservation> reservations) {
        super(id, name, surname, email, password, postalCode, city, address, telephone,
                createdAt, updatedAt, blacklisted, profilePhoto);
        this.languages = languages;
        this.description = description;
        this.beautyServicesList = beautyServicesList;
        this.reservations = reservations;
    }

    public Provider() {}
}