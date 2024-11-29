package com.globelle.back.controller;

import com.globelle.back.model.BeautyService;
import com.globelle.back.model.Provider;
import com.globelle.back.service.BeautyServiceService;
import com.globelle.back.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.*;

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
    public Provider getProvider(@PathVariable int id) throws ResponseStatusException {
        Optional<Provider> p = providerService.getProvider(id);
        if(p.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found");
        }
        return p.get();
    }



    // ex: http://localhost:8080/providers/1/services
    @GetMapping("/{id}/services")
    public List<BeautyService> getBeautyServicesByProviderId(@PathVariable Integer id) throws ResponseStatusException {
        List<BeautyService> bs = beautyServiceService.getAllBeautyServicesByProviderId(id);
        if(bs.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found");
        }
        return bs;
    }


    @DeleteMapping("/{id}")
    public void deleteProvider(@PathVariable int id) {
        providerService.deleteProvider(id);
    }

    @PostMapping("")
    public ResponseEntity<Integer> insertProvider(@RequestBody Provider p) {
        Provider pNew = providerService.insertProvider(p);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(pNew.getId());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Integer> updateProvider(@PathVariable int id, @RequestBody Provider p) {
        Provider pUpdate = providerService.updateProvider(p, id);
        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .body(pUpdate.getId());
    }


}
