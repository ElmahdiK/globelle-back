package com.globelle.back.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
//@SuperBuilder
@Data
public class Client extends User  implements Serializable {

    @OneToMany
    private List<Favorite> favoritesList = new ArrayList<>();
}
