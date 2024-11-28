package com.globelle.back.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Provider extends User implements Serializable {

    @Column
    private String languages;

    @Column
    private String description;

    @OneToMany
    private List<BeautyService> beautyServiceList = new ArrayList<>();

    @OneToMany
    private List<Opinion> opinionList = new ArrayList<>();

    public Provider(Integer id, String name, String surname, String email,
                    String password, String postalCode, String city,
                    String address, String telephone) {
        super(id, name, surname, email, password, postalCode, city, address, telephone);
    }

    public Provider() {}
}