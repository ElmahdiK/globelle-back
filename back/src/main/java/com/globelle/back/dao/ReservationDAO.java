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

    @Query(value = "SELECT r.* FROM reservation r INNER JOIN user_reservations_list lr ON r.id = lr.reservations_list_id WHERE lr.user_id = :userId", nativeQuery = true)
    List<Reservation> findReservationsByUserId(@Param("userId") int userId);

    @Query(value = "SELECT r.* FROM reservation r INNER JOIN user_reservations_list lr ON r.id = lr.reservations_list_id WHERE lr.user_id = :userId AND r.id = :id", nativeQuery = true)
    Reservation findReservationByReservationIdAndUserId(@Param("userId") int userId, @Param("id") int id);

}
