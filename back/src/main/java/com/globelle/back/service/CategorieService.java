package com.globelle.back.service;

import com.globelle.back.dao.CategorieDAO;
import com.globelle.back.model.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService {

    @Autowired
    private CategorieDAO categorieDAO;

    public List<Categorie> getAllCategories(){
        return (List<Categorie>) categorieDAO.findAll();
    }
}
