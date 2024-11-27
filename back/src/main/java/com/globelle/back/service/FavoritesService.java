package com.globelle.back.service;

import com.globelle.back.dao.FavoritesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FavoritesService {

    @Autowired
    private FavoritesDAO favoritesDAO;

    public List<Favorites> getAllFavorites(){
        return (List<Favorites>) favoritesDAO.findAll();
    }

    public Optional<Favorites> getFavorite(int id) {
        return favoritesDAO.findById(id);
    }
}
