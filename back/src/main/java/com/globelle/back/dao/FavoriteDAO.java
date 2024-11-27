package com.globelle.back.dao;

import com.globelle.back.model.Favorite;
import org.springframework.data.repository.CrudRepository;

public interface FavoriteDAO extends CrudRepository<Favorite, Integer> {
}
