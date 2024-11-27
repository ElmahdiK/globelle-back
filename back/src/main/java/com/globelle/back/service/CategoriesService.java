package com.globelle.back.service;

import com.globelle.back.dao.CategoriesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriesService {

    @Autowired
    private CategoriesDAO categoriesDAO;

    public List<Categories> getAllCategories(){
        return (List<Categories>) categoriesDAO.findAll();
    }

    public Optional<Categories> getCategorie(int id) {
        return categoriesDAO.findById(id);
    }
}
