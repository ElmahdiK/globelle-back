package com.globelle.back.dao;

import com.globelle.back.model.Provider;
import org.springframework.data.repository.CrudRepository;

public interface ProviderDAO extends CrudRepository<Provider, Integer> {
}
