package com.globelle.back.service;

import com.globelle.back.dao.CategoriesDAO;
import com.globelle.back.model.Categories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesService {

    @Autowired
    private CategoriesDAO categoriesDAO;

    public List<Categories> getAllCategories(){
        return (List<Categories>) categoriesDAO.findAll();
    }
}
