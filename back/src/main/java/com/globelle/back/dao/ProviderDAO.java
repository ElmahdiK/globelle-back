package com.globelle.back.dao;

import com.globelle.back.model.Provider;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProviderDAO extends CrudRepository<Provider, Integer> {

}
