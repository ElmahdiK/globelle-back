package com.globelle.back.service;

import com.globelle.back.dao.ReservationDAO;
import com.globelle.back.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    @Autowired
    private ReservationDAO reservationDAO;

    public List<Reservation> getAllReservations(){
        return (List<Reservation>) reservationDAO.findAll();
    }

    public Optional<Reservation> getReservation(int id) {
        return reservationDAO.findById(id);
    }
}
