package com.globelle.back.model;

import java.io.Serializable;
import java.util.*;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String email;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id")
    )
    private Set<Role> roles = new HashSet<>();

    @OneToMany
    private List<Favorite> favoritesList = new ArrayList<>();

    @Column
    private String languages;

    @Column
    private String description;

    @Column
    private float note;

    @Column
    private int nbOpinions = 0;

    @Column
    private String dispo;

    @OneToMany
    private List<BeautyService> beautyServiceList = new ArrayList<>();

    @OneToMany
    private List<Opinion> opinionList = new ArrayList<>();

    @Column
    private String name;

    @Column
    private String surname;


    @Column
    private String postalCode;

    @Column
    private String city;

    @Column
    private String address;

    @Column
    private String telephone;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt = new Date();

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt = new Date();

    @Column(nullable = false)
    private boolean blacklisted;

    @Column
    private String urlImage;

    @OneToMany
    private List<Reservation> reservationsList = new ArrayList<>();

}