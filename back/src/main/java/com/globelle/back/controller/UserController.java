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
    @Autowired
    private UserService userService;

    @Autowired
    private ReservationService reservationService;

    /*
    @GetMapping(value = {"", "/"})
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }*/

    @GetMapping(value = {"/{id}", "/{id}/"})
    public User getUserById(@PathVariable int id) {
        Optional<User> u = userService.getUser(id);
        return u.orElse(null);
    }

    @GetMapping(value = {"providers", "providers/"})
    public List<User> getAllUsersProviders() {
        return userService.getAllUsersProviders();
    }



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
    public ResponseEntity<Integer> updateUser(@PathVariable int id, @RequestBody User c) {
        User cUpdate = userService.updateUser(c, id);
        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .body(cUpdate.getId());
    }

    @Autowired
    private BeautyServiceService beautyServiceService;

    // search?service="manicure"
    @GetMapping(value = {"/search"})
    public List<User> getProviderByBeautyServicesName(@RequestParam("service") String serviceName) {
        return userService.getUserByBeautyServicesName(serviceName);
    }

    /*

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
        userService.deleteProvider(id);
    }

    @PostMapping("")
    public ResponseEntity<Integer> insertProvider(@RequestBody Provider p) {
        Provider pNew = userService.insertProvider(p);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(pNew.getId());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Integer> updateProvider(@PathVariable int id, @RequestBody Provider p) {
        Provider pUpdate = userService.updateProvider(p, id);
        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .body(pUpdate.getId());
    }
*/
}
