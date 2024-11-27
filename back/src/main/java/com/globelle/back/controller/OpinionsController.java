package com.globelle.back.controller;

import com.globelle.back.model.Opinion;
import com.globelle.back.service.OpinionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/opinions")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class OpinionsController {
    @Autowired
    private OpinionsService opinionsService;

    @GetMapping("")
    public List<Opinion> getAllOpinions() {
        return opinionsService.getAllOpinions();
    }
}
