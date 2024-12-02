package com.globelle.back.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Provider extends Userr implements Serializable {
    @Column
    private String languages;

    @Column
    private String description;

    @Column
    private float note;

    @Column
    private int nbOpinions;

    @Column
    private String dispo;

    @OneToMany
    private List<BeautyService> beautyServiceList = new ArrayList<>();

    @OneToMany
    private List<Opinion> opinionList = new ArrayList<>();
}