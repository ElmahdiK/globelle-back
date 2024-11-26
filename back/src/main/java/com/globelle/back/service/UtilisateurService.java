package com.globelle.back.service;

import com.globelle.back.dao.ReservationDAO;
import com.globelle.back.dao.UtilisateurDAO;
import com.globelle.back.model.Reservation;
import com.globelle.back.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurDAO utilisateurDAO;

    public List<Utilisateur> getAllUtilisateurs(){
        return (List<Utilisateur>) utilisateurDAO.findAll();
    }
}
