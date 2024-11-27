package com.globelle.back.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.UUID;

@Entity
@SuperBuilder
@Data
abstract public class PaymentType implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    @Getter
    private UUID id;

    @Column(nullable = false)
    @Getter
    private String paymentType;

    public PaymentType(UUID id, String paymentType) {
        this.id = id;
        this.paymentType = paymentType;
    }

    public PaymentType() {
    }
}
