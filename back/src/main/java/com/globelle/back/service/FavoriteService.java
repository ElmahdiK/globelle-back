package com.globelle.back.service;

import com.globelle.back.dao.FavoriteDAO;
import com.globelle.back.model.Favorite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FavoriteService {

    @Autowired
    private FavoriteDAO favoriteDAO;

    public List<Favorite> getAllFavorites(){
        return (List<Favorite>) favoriteDAO.findAll();
    }

    public Optional<Favorite> getFavorite(int id) {
        return favoriteDAO.findById(id);
    }
}
