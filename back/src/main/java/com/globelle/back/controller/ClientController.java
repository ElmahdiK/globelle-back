package com.globelle.back.controller;

import com.globelle.back.model.Client;
import com.globelle.back.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    public List<Client> getAllClients(){
        return clientService.getAllClients();
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable int id) throws ResponseStatusException {
        Optional<Client> c = clientService.getClient(id);
        if (c.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found");
        }
        return c.get();
    }
}
