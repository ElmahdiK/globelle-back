package com.globelle.back.dao;
import com.globelle.back.model.Client;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ClientDAO extends CrudRepository<Client, Integer> {

    // Recherche par un attribut
    List<Client> findByNom(String nom); // Cherche tous les adhérents avec un nom donné
}
