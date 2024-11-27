package com.globelle.back.controller;

import com.globelle.back.model.BeautyServices;
import com.globelle.back.service.BeautyServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/services")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BeautyServicesController {
    @Autowired
    private BeautyServicesService beautyServicesService;

    @GetMapping("")
    public List<BeautyServices> getAllBeautyServices(){
        return beautyServicesService.getAllBeautyServices();
    }

    @GetMapping("/{id}")
    public BeautyServices getBeautyServiceById(@PathVariable int id) throws ResponseStatusException {
        Optional<BeautyServices> b = beautyServicesService.getBeautyService(id);
        if(b.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found");
        }
        return b.get();
    }
}
