package com.globelle.back.controller;

import com.globelle.back.model.Opinion;
import com.globelle.back.service.OpinionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/opinions")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class OpinionController {
    @Autowired
    private OpinionService opinionService;

    @GetMapping(value = {"", "/"})
    public List<Opinion> getAllOpinions() {
        return opinionService.getAllOpinions();
    }

    @GetMapping(value = {"/{id}", "/{id}/"})
    public Opinion getOpinionById(@PathVariable int id) {
        Optional<Opinion> o = opinionService.getOpinion(id);
        return o.get();
    }
}
