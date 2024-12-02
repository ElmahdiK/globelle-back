package com.globelle.back.dao;

import com.globelle.back.model.Reservation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReservationDAO extends CrudRepository<Reservation, Integer> {

    @Query("SELECT r.reservationDate FROM Reservation r WHERE r.providerId = :providerId")
    List<String> findByProviderId(int providerId);

    // SELECT r.reservation_date FROM Reservation r WHERE r.provider_id = "1" AND r.reservation_date = "2024-11-30"
    @Query(value = "SELECT r.reservation_date FROM Reservation r WHERE r.provider_id = :providerId AND r.reservation_date LIKE :reservationDate%", nativeQuery = true)
    List<String> findByProviderIdAndDate(int providerId, String reservationDate);


    @Query(value = "SELECT r.* FROM reservation r INNER JOIN provider_reservations_list lr ON r.id = lr.reservations_list_id WHERE lr.provider_id = :providerId", nativeQuery = true)
    List<Reservation> findReservationsByProviderId(@Param("providerId") int providerId);

    @Query(value = "SELECT r.* FROM reservation r INNER JOIN provider_reservations_list lr ON r.id = lr.reservations_list_id WHERE lr.provider_id = :providerId AND r.id = :id", nativeQuery = true)
    Reservation findReservationByReservationIdAndProviderId(@Param("providerId") int providerId, @Param("id") int id);

    @Query(value = "SELECT r.* FROM reservation r INNER JOIN client_reservations_list lr ON r.id = lr.reservations_list_id WHERE lr.client_id = :clientId", nativeQuery = true)
    List<Reservation> findReservationsByClientId(@Param("clientId")int clientId);

    @Query(value = "SELECT r.* FROM reservation r INNER JOIN client_reservations_list lr ON r.id = lr.reservations_list_id WHERE lr.client_id = :clientId AND r.id = :id", nativeQuery = true)
    Reservation findReservationByReservationIdAndClientId(@Param("clientId")Integer clientId, @Param("id") Integer id);
}
