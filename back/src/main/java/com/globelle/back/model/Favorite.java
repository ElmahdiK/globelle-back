package com.globelle.back.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.UUID;

@Entity
@SuperBuilder
@Data
public class Favorite implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    @Getter
    private UUID id;

    public Favorite() {
    }
}
