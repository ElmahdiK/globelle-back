package com.globelle.back.service;

import com.globelle.back.dao.AvisDAO;
import com.globelle.back.dao.CategorieDAO;
import com.globelle.back.model.Avis;
import com.globelle.back.model.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvisService {

    @Autowired
    private AvisDAO avisDAO;

    public List<Avis> getAllAvis(){
        return (List<Avis>) avisDAO.findAll();
    }
}
