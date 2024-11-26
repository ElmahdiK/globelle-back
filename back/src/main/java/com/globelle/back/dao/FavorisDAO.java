package com.globelle.back.dao;

import com.globelle.back.model.Favoris;
import org.springframework.data.repository.CrudRepository;

public interface FavorisDAO extends CrudRepository<Favoris, Integer> {
}
