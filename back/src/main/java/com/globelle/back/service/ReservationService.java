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

    public Optional<Reservation> getReservation(Integer id) {
        return reservationDAO.findById(id);
    }

    public List<String> getReservationById(Integer id) {
        return reservationDAO.findByProviderId(id);
    }

    public List<String> getReservationByProviderIdAndDate(int id, String date) {
        return reservationDAO.findByProviderIdAndDate(id, date);
    }

    public void deleteReservation(int id) {
        reservationDAO.deleteById(id);

    }

    public Reservation insertReservation(Reservation r) {
        r.setId(null);
        return reservationDAO.save(r);
    }

    public Reservation updateReservation(Reservation r, int id) {
        r.setId(id);
        return reservationDAO.save(r);
    }


    public List<Reservation> getReservationsByProviderId(Integer userId) {
        return reservationDAO.findReservationsByProviderId(userId);
    }
    public List<Reservation> getReservationsByClientId(Integer userId) {
        return reservationDAO.findReservationsByClientId(userId);
    }

}
