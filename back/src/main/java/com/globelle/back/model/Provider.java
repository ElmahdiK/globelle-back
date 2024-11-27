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
import java.util.List;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Entity
//@SuperBuilder
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
    private List<BeautyService> beautyServiceList = new ArrayList<>();

    @OneToMany
    private List<Opinion> opinionList = new ArrayList<>();

    public Provider(UUID id, String name, String surname, String email,
                    String password, String postalCode, String city,
                    String address, String telephone) {
        super(id, name, surname, email, password, postalCode, city, address, telephone);
    }

    public Provider() {}
}