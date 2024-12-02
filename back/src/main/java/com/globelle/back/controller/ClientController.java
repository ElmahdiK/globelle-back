package com.globelle.back.controller;

import com.globelle.back.model.Client;
import com.globelle.back.model.Reservation;
import com.globelle.back.service.ClientService;
import com.globelle.back.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clients")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ClientController {
    @Autowired
    private ClientService clientService;


    @Autowired
    private ReservationService reservationService;

    @GetMapping(value = {"", "/"})
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping(value = {"/{id}", "/{id}/"})
    public Client getClientById(@PathVariable int id) {
        Optional<Client> c = clientService.getClient(id);
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

    @GetMapping(value = {"/{clientId}/reservations/{id}"})
    public Reservation getReservationByReservationIdAndClientId(@PathVariable Integer clientId, @PathVariable Integer id) {
        return reservationService.getReservationByReservationIdAndClientId(clientId, id);
    }

    //http://localhost:8080/clients/2/reservations
    @GetMapping(value = {"/{id}/reservations"})
    public List<Reservation> getReservationsClientId(@PathVariable int id) {
        return reservationService.getReservationsByClientId(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Integer> updateClient(@PathVariable int id, @RequestBody Client c) {
        Client cUpdate = clientService.updateClient(c, id);
        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .body(cUpdate.getId());
    }
}
