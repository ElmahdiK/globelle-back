package com.globelle.back.controller;

import com.globelle.back.model.Favorite;
import com.globelle.back.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/favorites")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FavoriteController {
    @Autowired
    private FavoriteService favoriteService;

    @GetMapping(value = {"", "/"})
    public List<Favorite> getAllFavorite() {
        return favoriteService.getAllFavorites();
    }

    @GetMapping(value = {"/{id}", "/{id}/"})
    public Favorite getFavoriteById(@PathVariable int id) {
        Optional<Favorite> f = favoriteService.getFavorite(id);
        return f.get();
    }
}
