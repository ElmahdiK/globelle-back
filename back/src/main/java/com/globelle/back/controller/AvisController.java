package com.globelle.back.controller;

import com.globelle.back.model.Avis;
import com.globelle.back.model.Categorie;
import com.globelle.back.service.AvisService;
import com.globelle.back.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/avis")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AvisController {
    @Autowired
    private AvisService avisService;

    @GetMapping("")
    public List<Avis> getAllAvis() {
        return avisService.getAllAvis();
    }
}
