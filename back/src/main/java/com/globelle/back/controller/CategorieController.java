package com.globelle.back.controller;

import com.globelle.back.model.Categorie;
import com.globelle.back.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategorieController {
    @Autowired
    private CategorieService categorieService;

    @GetMapping("")
    public List<Categorie> getAllCategories() {
        return categorieService.getAllCategories();
    }
}
