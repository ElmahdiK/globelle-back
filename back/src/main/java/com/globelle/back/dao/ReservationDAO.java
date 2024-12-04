package com.globelle.back.dao;

import com.globelle.back.model.Reservation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReservationDAO extends CrudRepository<Reservation, Integer> {

    @Query("SELECT r.reservationDate FROM Reservation r WHERE r.providerId = :providerId")
    List<String> findByProviderId(@Param("providerId") int providerId);

    @Query(value = "SELECT r.reservation_date FROM reservation r WHERE r.provider_id = :providerId AND r.reservation_date LIKE :reservationDate%", nativeQuery = true)
    List<String> findByProviderIdAndDate(@Param("providerId") int providerId, @Param("reservationDate") String reservationDate);

    @Query(value = "SELECT r.*, b.name, b.price FROM reservation r INNER JOIN beauty_service b ON b.id = r.beauty_service_id WHERE r.provider_id = :userId", nativeQuery = true)
    List<Reservation> findReservationsByProviderId(@Param("userId") int userId);

    @Query(value = "SELECT r.*, b.name, b.price FROM reservation r INNER JOIN beauty_service b ON b.id = r.beauty_service_id WHERE r.client_id = :userId", nativeQuery = true)
    List<Reservation> findReservationsByClientId(@Param("userId") int userId);

}
