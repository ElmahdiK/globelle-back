package com.globelle.back.controller;

import com.globelle.back.model.Reservation;
import com.globelle.back.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static com.globelle.back.service.ReservationService.getReservation;

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
    public Reservation getReservationById(@PathVariable int id) throws ResponseStatusException {
        Optional<Reservation> r = reservationService.getReservation(id);
        if (r.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found");
        }
        return r.get();
    }

    // providers/id/date
    // ex: http://localhost:8080/providers/1/20241214
    // retour la liste des heures
    @GetMapping("/{id}/{date}")
    public Reservation getBookedTimesFromProviderByDate(@PathVariable ("reservationId") String uuidStr, @PathVariable String date) throws ResponseStatusException {

        Reservation r = reservationService.getBookedTimesFromProviderByDate(getUuid(uuidStr), date);
        if(r == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found");
        }
        return r;
        // List.of("08:00", "09:00", "10:00");
    }



    private UUID getUuid(String uuidStr) {
//        if(uuidStr == null) {
//            throw new IllegalReservationExeption("Reservation ID should not be empty");
//        }
//        try {
            return UUID.fromString(uuidStr);
//        } catch(IllegalArgumentException iae) {
//            throw new IllegalReservationExeption("could not parse")
//        }
    }

}
