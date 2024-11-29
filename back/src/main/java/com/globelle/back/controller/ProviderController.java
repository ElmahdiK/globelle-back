package com.globelle.back.controller;

import com.globelle.back.model.BeautyService;
import com.globelle.back.model.Provider;
import com.globelle.back.service.BeautyServiceService;
import com.globelle.back.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/providers")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProviderController {
    @Autowired
    private ProviderService providerService;

    @Autowired
    private BeautyServiceService beautyServiceService;

    @GetMapping(value = {"", "/"})
    public List<Provider> getAllProviders() {
        return providerService.getAllProviders();
    }

    @GetMapping(value = {"/{id}", "/{id}/"})
    public Provider getProviderById(@PathVariable int id) {
        Optional<Provider> p = providerService.getProvider(id);
        return p.get();
    }

    @GetMapping(value = {"/{id}/services", "/{id}/services/"})
    public List<BeautyService> getBeautyServicesByProviderId(@PathVariable Integer id) {
        List<BeautyService> bs = beautyServiceService.getAllBeautyServicesByProviderId(id);
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
