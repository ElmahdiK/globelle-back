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
}
