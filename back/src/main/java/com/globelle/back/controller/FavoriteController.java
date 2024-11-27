package com.globelle.back.controller;

import com.globelle.back.model.Favorite;
import com.globelle.back.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/favorites")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FavoriteController {
    @Autowired
    private FavoriteService favoriteService;

    @GetMapping("")
    public List<Favorite> getAllFavorite() {
        return favoriteService.getAllFavorites();
    }

    @GetMapping("/{id}")
    public Favorite getFavoriteById(@PathVariable int id) throws ResponseStatusException {
        Optional<Favorite> f = favoriteService.getFavorite(id);
        if(f.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found");
        }
        return f.get();
    }
}
