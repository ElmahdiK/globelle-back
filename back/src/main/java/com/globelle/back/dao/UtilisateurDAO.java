package com.globelle.back.dao;

import com.globelle.back.model.Utilisateur;
import org.springframework.data.repository.CrudRepository;

public interface UtilisateurDAO extends CrudRepository<Utilisateur, Integer> {
}
