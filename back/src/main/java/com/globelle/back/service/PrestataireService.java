package com.globelle.back.service;

import com.globelle.back.dao.PrestataireDAO;
import com.globelle.back.model.Prestataire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrestataireService {

    @Autowired
    private PrestataireDAO prestataireDAO;

    public List<Prestataire> getAllPrestataires(){
        return (List<Prestataire>) prestataireDAO.findAll();
    }
}
