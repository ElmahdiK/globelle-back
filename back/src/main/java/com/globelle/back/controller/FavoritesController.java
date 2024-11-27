package com.globelle.back.controller;

import com.globelle.back.model.Favorites;
import com.globelle.back.service.FavoritesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/favorites")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FavoritesController {
    @Autowired
    private FavoritesService favoritesService;

    @GetMapping("")
    public List<Favorites> getAllFavorites() {
        return favoritesService.getAllFavorites();
    }

    @GetMapping("/{id}")
    public Favorites getFavoriteById(@PathVariable int id) throws ResponseStatusException {
        Optional<Favorites> f = favoritesService.getFavorite(id);
        if(f.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found");
        }
        return f.get();
    }
}
