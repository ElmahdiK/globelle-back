package com.globelle.back.controller;

import com.globelle.back.model.BeautyService;
import com.globelle.back.model.Provider;
import com.globelle.back.model.Reservation;
import com.globelle.back.service.BeautyServiceService;
import com.globelle.back.service.ProviderService;
import com.globelle.back.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.*;

@RestController
@RequestMapping("/providers")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProviderController {
    @Autowired
    private ProviderService providerService;

    @Autowired
    private BeautyServiceService beautyServiceService;

    @Autowired
    private ReservationService reservationService;

    @GetMapping(value = {"", "/"})
    public List<Provider> getAllProviders() {
        return providerService.getAllProviders();
    }

    @GetMapping(value = {"/search"})
    public List<Provider> getProviderByBeautyServicesName(@RequestParam("service") String serviceName) {
        return providerService.getProviderByBeautyServicesName(serviceName);
    }

    @GetMapping(value = {"/{id}/reservations"})
    public List<Reservation> getReservationsProviderId(@PathVariable Integer providerId) {
        return reservationService.getReservationsByProviderId(providerId);
    }

    @GetMapping(value = {"/{providerId}/reservations/{id}"})
    public Reservation getReservationByReservationId(@PathVariable Integer providerId, @PathVariable Integer id) {
        return reservationService.getReservationByReservationId(providerId, id);
    }

    // ex: http://localhost:8080/provider/0/reservations/20241201
    @GetMapping("{id}/reservations/{id}/{date}")
    public List<String> getReservationByProviderIdAndDate(@PathVariable Integer id, @PathVariable String date) throws ResponseStatusException {
        List<String> r = reservationService.getReservationByIdAndDate(id, date);
        List<String> horaires = new ArrayList<>();
        if (!r.isEmpty()) {
            for (String datetime : r) horaires.add(datetime.split(" ")[1]);
        }
        return horaires;
    }

    @GetMapping(value = {"/{id}", "/{id}/"})
    public Provider getProvider(@PathVariable int id) {
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
