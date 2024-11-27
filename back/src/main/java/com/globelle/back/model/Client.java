package com.globelle.back.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Entity
//@SuperBuilder
@Data
public class Client extends User  implements Serializable {

    @OneToMany
    private List<Favorite> favoritesList = new ArrayList<>();

    public Client(UUID id, String name, String surname, String email,
                  String password, String postalCode, String city,
                  String address, String telephone) {
        super(id, name, surname, email, password, postalCode, city, address,
                telephone);
    }

    public Client() {
    }
}
