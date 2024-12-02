package com.globelle.back.dao;

import com.globelle.back.model.Reservation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ReservationDAO extends CrudRepository<Reservation, Integer> {

    @Query("SELECT r.reservationDate FROM Reservation r WHERE r.providerId = :providerId")
    List<String> findByProviderId(int providerId);

    @Query("SELECT r.reservationDate FROM Reservation r WHERE r.providerId = :providerId AND r.reservationDate LIKE :reservationDate%")
    List<String> findByProviderIdAndDate(int providerId, String reservationDate);


    @Query("SELECT lr.reservations_list_id FROM provider_reservations_list lr WHERE lr.provider_id = :providerId")
    List<Reservation> findReservationsByProviderId(Integer providerId);

    @Query("SELECT * FROM reservation r WHERE r.id = :id AND r.provider_id = : providerId")
    Reservation findReservationByReservationId(Integer providerId, Integer id);
}
