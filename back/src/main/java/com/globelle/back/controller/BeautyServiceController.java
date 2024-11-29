package com.globelle.back.controller;

import com.globelle.back.model.BeautyService;
import com.globelle.back.model.Provider;
import com.globelle.back.service.BeautyServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/services")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BeautyServiceController {
    @Autowired
    private BeautyServiceService beautyServiceService;

    @GetMapping("")
    public List<BeautyService> getAllBeautyServices(){
        return beautyServiceService.getAllBeautyServices();
    }

    @GetMapping("/{id}")
    public BeautyService getBeautyServiceById(@PathVariable int id) throws ResponseStatusException {
        Optional<BeautyService> b = beautyServiceService.getBeautyService(id);
        if(b.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found");
        }
        return b.get();
    }


    @DeleteMapping("/{id}")
    public void deleteBeautyService(@PathVariable int id) {
        beautyServiceService.deleteProvider(id);
    }

    @PostMapping("")
    public ResponseEntity<Integer> insertBeautyService(@RequestBody BeautyService bs) {
        BeautyService bsNew = beautyServiceService.insertProvider(bs);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(bsNew.getId());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Integer> updateBeautyService(@PathVariable int id, @RequestBody BeautyService bs) {
        BeautyService bsUpdate = beautyServiceService.updateProvider(bs, id);
        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .body(bsUpdate.getId());
    }


}
