package com.globelle.back.controller;

import com.globelle.back.model.Client;
import com.globelle.back.model.Provider;
import com.globelle.back.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clients")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("")
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable int id) throws ResponseStatusException {
        Optional<Client> c = clientService.getClient(id);
        if(c.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found");
        }
        return c.get();
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable int id) {
        clientService.deleteClient(id);
    }

    @PostMapping("")
    public ResponseEntity<Integer> insertClient(@RequestBody Client c) {
        Client cNew = clientService.insertClient(c);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(cNew.getId());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Integer> updateClient(@PathVariable int id, @RequestBody Client c) {
        Client cUpdate = clientService.updateClient(c, id);
        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .body(cUpdate.getId());
    }
}
