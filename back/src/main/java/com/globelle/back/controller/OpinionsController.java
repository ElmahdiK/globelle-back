package com.globelle.back.controller;

import com.globelle.back.service.OpinionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/opinions")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class OpinionsController {
    @Autowired
    private OpinionsService opinionsService;

    @GetMapping("")
    public List<Opinions> getAllOpinions() {
        return opinionsService.getAllOpinions();
    }

    @GetMapping("/{id}")
    public Opinions getOpinionById(@PathVariable int id) throws ResponseStatusException {
        Optional<Opinions> o = opinionsService.getOpinion(id);
        if(o.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found");
        }
        return o.get();
    }
}
