package com.globelle.back.dao;

import com.globelle.back.model.Opinion;
import org.springframework.data.repository.CrudRepository;

public interface OpinionsDAO extends CrudRepository<Opinion, Integer> {
}
