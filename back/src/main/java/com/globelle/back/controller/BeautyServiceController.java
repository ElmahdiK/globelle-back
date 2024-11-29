package com.globelle.back.controller;

import com.globelle.back.model.BeautyService;
import com.globelle.back.service.BeautyServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/services")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BeautyServiceController {
    @Autowired
    private BeautyServiceService beautyServiceService;

    @GetMapping(value = {"", "/"})
    public List<BeautyService> getAllBeautyServices() {
        return beautyServiceService.getAllBeautyServices();
    }

    @GetMapping(value = {"/{id}", "/{id}/"})
    public BeautyService getBeautyServiceById(@PathVariable int id) {
        Optional<BeautyService> b = beautyServiceService.getBeautyService(id);
        return b.get();
    }
}
