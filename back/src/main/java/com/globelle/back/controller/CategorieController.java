package com.globelle.back.controller;

import com.globelle.back.model.Categorie;
import com.globelle.back.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categories")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategorieController {
    @Autowired
    private CategorieService categorieService;

    @GetMapping(value = {"", "/"})
    public List<Categorie> getAllCategories() {
        return categorieService.getAllCategories();
    }

    @GetMapping(value = {"/{id}", "/{id}/"})
    public Categorie getCategorieById(@PathVariable int id) {
        Optional<Categorie> c = categorieService.getCategorie(id);
        return c.get();
    }
}


