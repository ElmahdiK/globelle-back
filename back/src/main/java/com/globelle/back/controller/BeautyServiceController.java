package com.globelle.back.controller;

import com.globelle.back.model.BeautyService;
import com.globelle.back.service.BeautyServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/services")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BeautyServiceController {
    @Autowired
    private BeautyServiceService beautyServiceService;

    // http://localhost:8080/services
    @GetMapping(value = {"", "/"})
    public List<BeautyService> getAllBeautyServices() {
        return beautyServiceService.getAllBeautyServices();
    }

    // http://localhost:8080/services/1
    @GetMapping(value = {"/{id}", "/{id}/"})
    public BeautyService getBeautyServiceById(@PathVariable int id) {
        Optional<BeautyService> b = beautyServiceService.getBeautyService(id);
        return b.orElse(null);
    }

    // Delete + Post + Put
    @DeleteMapping("/{id}")
    public void deleteBeautyService(@PathVariable int id) {
        beautyServiceService.deleteBeautyService(id);
    }

    @PostMapping("")
    public ResponseEntity<Integer> insertBeautyService(@RequestBody BeautyService bs) {
        BeautyService bsNew = beautyServiceService.insertBeautyService(bs);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(bsNew.getId());
    }


    @PutMapping("/{id}")
    public ResponseEntity<Integer> updateBeautyService(@PathVariable int id, @RequestBody BeautyService bs) {
        BeautyService bsUpdate = beautyServiceService.updateBeautyService(bs, id);
        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .body(bsUpdate.getId());
    }
}