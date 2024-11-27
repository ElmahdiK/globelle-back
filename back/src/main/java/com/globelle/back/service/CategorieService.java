package com.globelle.back.service;

import com.globelle.back.dao.CategorieDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategorieService {

    @Autowired
    private CategorieDAO categorieDAO;

    public List<Categorie> getAllCategories(){
        return (List<Categorie>) categorieDAO.findAll();
    }

    public Optional<Categorie> getCategorie(int id) {
        return categorieDAO.findById(id);
    }
}
