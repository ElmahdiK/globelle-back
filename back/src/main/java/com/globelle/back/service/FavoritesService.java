package com.globelle.back.service;

import com.globelle.back.dao.FavoritesDAO;
import com.globelle.back.model.Favorite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoritesService {

    @Autowired
    private FavoritesDAO favoritesDAO;

    public List<Favorite> getAllFavorites(){
        return (List<Favorite>) favoritesDAO.findAll();
    }
}
