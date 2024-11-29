package com.globelle.back.controller;

import com.globelle.back.model.Client;
import com.globelle.back.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clients")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping(value = {"", "/"})
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping(value = {"/{id}", "/{id}/"})
    public Client getClientById(@PathVariable int id) {
        Optional<Client> c = clientService.getClient(id);
        return c.get();
    }
}
