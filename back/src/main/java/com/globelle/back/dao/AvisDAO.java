package com.globelle.back.dao;

import com.globelle.back.model.Avis;
import org.springframework.data.repository.CrudRepository;

public interface AvisDAO extends CrudRepository<Avis, Integer> {
}
