package com.globelle.back.controller;

import com.globelle.back.model.Provider;
import com.globelle.back.service.BeautyServiceService;
import com.globelle.back.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/providers")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProviderController {
    @Autowired
    private ProviderService providerService;

    @Autowired
    private BeautyServiceService beautyServiceService;

    @GetMapping("")
    public List<Provider> getAllProviders(){
        return providerService.getAllProviders();
    }

    @GetMapping("/{id}")
    public Provider getProviderById(@PathVariable int id) throws ResponseStatusException {
        Optional<Provider> p = providerService.getProvider(id);
        if(p.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found");
        }
        return p.get();
    }

    /*
    @GetMapping("/{id}/services")
    public Provider getBeautyServicesFromProvider(@PathVariable int idProvider) throws ResponseStatusException {

        Optional<BeautyServices> b = beautyServicesService.getAllBeautyServices(idProvider);
        if(b.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found");
        }
        return b.get();
    }
    */
}
