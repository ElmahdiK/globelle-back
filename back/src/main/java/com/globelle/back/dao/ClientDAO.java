package com.globelle.back.dao;

import com.globelle.back.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientDAO extends CrudRepository<Client, Integer> {
}
