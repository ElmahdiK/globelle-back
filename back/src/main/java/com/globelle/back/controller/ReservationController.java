package com.globelle.back.controller;

import com.globelle.back.model.Reservation;
import com.globelle.back.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reservations")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @GetMapping("")
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @GetMapping("/{id}")
    public Reservation getReservationById(@PathVariable Integer id) throws ResponseStatusException {
        Optional<Reservation> r = reservationService.getReservation(id);
        if (r.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found");
        }
        return r.get();
    }

    // ex: http://localhost:8080/reservations/provider/0
    @GetMapping("/provider/{id}")
    public List<String> getReservationByProviderId(@PathVariable Integer id) throws ResponseStatusException {
        List<String> r = reservationService.getReservationById(id);
        if (r.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found");
        }
        return r;
    }

    // ex: http://localhost:8080/reservations/provider/0/20241201
    @GetMapping("/provider/{id}/{date}")
    public List<String> getReservationByProviderIdAndDate(@PathVariable Integer id, @PathVariable String date) throws ResponseStatusException {
        List<String> r = reservationService.getReservationByIdAndDate(id, date);
        List<String> horaires = new ArrayList<>();
        if (!r.isEmpty()) {
            for (String datetime : r) horaires.add(datetime.split(" ")[1]);
        }
        return horaires;
    }

}
