package com.globelle.back.service;

import com.globelle.back.dao.FavorisDAO;
import com.globelle.back.dao.PrestataireDAO;
import com.globelle.back.model.Favoris;
import com.globelle.back.model.Prestataire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavorisService {

    @Autowired
    private FavorisDAO favorisDAO;

    public List<Favoris> getAllFavoris(){
        return (List<Favoris>) favorisDAO.findAll();
    }
}
