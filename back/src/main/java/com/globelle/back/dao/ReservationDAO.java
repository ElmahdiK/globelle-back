package com.globelle.back.dao;

import com.globelle.back.model.Reservation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface ReservationDAO extends CrudRepository<Reservation, Integer> {

   // @Query("SELECT r FROM Reservation r WHERE r.providerId = :providerId AND CONCAT(YEAR(r.reservationDate), '') LIKE %:datePattern%")
    List<Reservation> findByProviderIdAndReservationDateLike(
            @Param("providerId") UUID providerId,
            @Param("datePattern") String datePattern);
}
