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

    // search?service="manicure"
    @GetMapping(value = {"/search"})
    public List<Provider> getProviderByBeautyServicesName(@RequestParam("service") String serviceName) {
        return providerService.getProviderByBeautyServicesName(serviceName);
    }

    @GetMapping(value = {"/{id}", "/{id}/"})
    public Provider getProvider(@PathVariable int id) {
        Optional<Provider> p = providerService.getProvider(id);
        return p.orElse(null);
    }

    @GetMapping(value = {"/{providerId}/reservations/{id}"})
    public Reservation getReservationByReservationIdAndProviderId(@PathVariable Integer providerId, @PathVariable Integer id) {
        return reservationService.getReservationByReservationIdAndProviderId(providerId, id);
    }

    //http://localhost:8080/providers/2/reservations
    @GetMapping(value = {"/{id}/reservations"})
    public List<Reservation> getReservationsProviderId(@PathVariable int id) {
        return reservationService.getReservationsByProviderId(id);
    }

    @GetMapping(value = {"/{id}/reservations/date/{date}"})
    // http://localhost:8080/providers/1/reservations/date/2024-11-30
    public List<String> getReservationByProviderIdAndDate(@PathVariable int id, @PathVariable String date) {
        List<String> r = reservationService.getReservationByIdAndDate(id, date);
        List<String> horaires = new ArrayList<>();
        System.out.println(r);
        if (!r.isEmpty()) {
            for (String datetime : r) horaires.add(datetime.split(" ")[1]);
        }
        return horaires;
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
