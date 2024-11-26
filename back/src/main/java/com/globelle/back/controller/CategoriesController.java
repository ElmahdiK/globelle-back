package com.globelle.back.controller;

import com.globelle.back.model.Categories;
import com.globelle.back.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoriesController {
    @Autowired
    private CategoriesService categoriesService;

    @GetMapping("")
    public List<Categories> getAllCategories() {
        return categoriesService.getAllCategories();
    }
}
