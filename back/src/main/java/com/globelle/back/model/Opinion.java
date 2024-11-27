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
@Data
public class Opinion implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    @Getter
    private UUID id;

    public Opinion() {
    }
}
