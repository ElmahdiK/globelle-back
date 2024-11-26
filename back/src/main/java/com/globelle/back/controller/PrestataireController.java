package com.globelle.back.controller;

import com.globelle.back.model.Prestataire;
import com.globelle.back.service.PrestataireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/prestataires")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PrestataireController {
    @Autowired
    private PrestataireService prestataireService;

    @GetMapping("")
    public List<Prestataire> getAllPrestataires(){
        return prestataireService.getAllPrestataires();
    }
}
