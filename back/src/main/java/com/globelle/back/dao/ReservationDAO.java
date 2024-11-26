package com.globelle.back.dao;

import com.globelle.back.model.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationDAO extends CrudRepository<Reservation, Integer> {
}
