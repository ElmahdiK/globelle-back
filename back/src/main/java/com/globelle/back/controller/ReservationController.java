package com.globelle.back.controller;

import com.globelle.back.model.Reservation;
import com.globelle.back.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reservations")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    // http://localhost:8080/reservations
    @GetMapping(value = {"", "/"})
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    // http://localhost:8080/reservations/1
    @GetMapping(value = {"/{id}", "/{id}/"})
    public Reservation getReservationById(@PathVariable Integer id) {
        Optional<Reservation> r = reservationService.getReservation(id);
        return r.orElse(null);
    }

//    // http://localhost:8080/reservations/users/1
//    @GetMapping("/users/{id}")
//    public List<String> getReservationByUserId(@PathVariable Integer id) throws ResponseStatusException {
//        List<String> r = reservationService.getReservationById(id);
//        if (r.isEmpty()) {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found");
//        }
//        return r;
//    }

    // Delete + Post + Put
    @DeleteMapping("/{id}")
    public void deleteReservation(@PathVariable int id) {
        reservationService.deleteReservation(id);
    }

    @PostMapping("")
    public ResponseEntity<Integer> insertReservation(@RequestBody Reservation r) {
        Reservation rNew = reservationService.insertReservation(r);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(rNew.getId());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Integer> updateReservation(@PathVariable int id, @RequestBody Reservation r) {
        Reservation rUpdate = reservationService.updateReservation(r, id);
        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .body(rUpdate.getId());
    }


}
