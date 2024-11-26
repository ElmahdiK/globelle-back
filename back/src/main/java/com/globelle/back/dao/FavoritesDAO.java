package com.globelle.back.dao;

import com.globelle.back.model.Favorites;
import org.springframework.data.repository.CrudRepository;

public interface FavoritesDAO extends CrudRepository<Favorites, Integer> {
}
