package com.globelle.back.controller;

import com.globelle.back.model.BeautyService;
import com.globelle.back.model.Reservation;
import com.globelle.back.model.User;
import com.globelle.back.service.BeautyServiceService;
import com.globelle.back.service.ReservationService;
import com.globelle.back.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {

    // PARTIE : userService
    @Autowired
    private UserService userService;

    // http://localhost:8080/users/1
    @GetMapping(value = {"/{id}", "/{id}/"})
    public User getUserById(@PathVariable int id) {
        Optional<User> u = userService.getUser(id);
        return u.orElse(null);
    }

    // http://localhost:8080/users/providers
    @GetMapping(value = {"providers", "providers/"})
    public List<User> getAllUsersProviders() {
        return userService.getAllUsersProviders();
    }

    // PARTIE : reservationService
    @Autowired
    private ReservationService reservationService;

    // http://localhost:8080/users/1/2/reservations
    @GetMapping(value = {"/1/{id}/reservations"})
    public List<Reservation> getReservationsProviderId(@PathVariable int id) {
        return reservationService.getReservationsByProviderId(id);
    }

    // http://localhost:8080/users/2/1/reservations
    @GetMapping(value = {"/2/{id}/reservations"})
    public List<Reservation> getReservationsClientId(@PathVariable int id) {
        return reservationService.getReservationsByClientId(id);
    }

    // http://localhost:8080/users/1/1/reservations/date/2024-11-30
    @GetMapping(value = {"/1/{id}/reservations/date/{date}"})
    public List<String> getReservationByProviderIdAndDate(@PathVariable int id, @PathVariable String date) {
        List<String> r = reservationService.getReservationByProviderIdAndDate(id, date);
        List<String> horaires = new ArrayList<>();
        System.out.println(r);
        if (!r.isEmpty()) {
            for (String datetime : r) horaires.add(datetime.split(" ")[1]);
        }
        return horaires;
    }

    // PARTIE : beautyServiceService
    @Autowired
    private BeautyServiceService beautyServiceService;

    // http://localhost:8080/users/1/search?service=manicure
    @GetMapping(value = {"1/search"})
    public List<User> getProviderByBeautyServicesName(@RequestParam("service") String serviceName) {
        return userService.getUserByBeautyServicesName(serviceName);
    }

    // http://localhost:8080/users/1/1/services
    @GetMapping(value = {"1/{id}/services", "1/{id}/services/"})
    public List<BeautyService> getBeautyServicesByProviderId(@PathVariable Integer id) {
        return beautyServiceService.getAllBeautyServicesByUserId(id);
    }

    // Delete + Post + Put => Mapping
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }

    @PostMapping("")
    public ResponseEntity<Integer> insertUser(@RequestBody User c) {
        User cNew = userService.insertUser(c);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(cNew.getId());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Integer> updateUser(@PathVariable int id, @RequestBody User c) {
        User cUpdate = userService.updateUser(c, id);
        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .body(cUpdate.getId());
    }

}
