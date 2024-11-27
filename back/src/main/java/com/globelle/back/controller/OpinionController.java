package com.globelle.back.controller;

import com.globelle.back.model.Opinion;
import com.globelle.back.service.OpinionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/opinions")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class OpinionController {
    @Autowired
    private OpinionService opinionService;

    @GetMapping("")
    public List<Opinion> getAllOpinions() {
        return opinionService.getAllOpinion();
    }

    @GetMapping("/{id}")
    public Opinion getOpinionById(@PathVariable int id) throws ResponseStatusException {
        Optional<Opinion> o = opinionService.getOpinion(id);
        if(o.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found");
        }
        return o.get();
    }
}
