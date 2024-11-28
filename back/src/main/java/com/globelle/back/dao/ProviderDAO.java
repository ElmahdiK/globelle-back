package com.globelle.back.dao;

import com.globelle.back.model.Provider;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProviderDAO extends CrudRepository<Provider, Integer> {

    // SELECT * FROM `reservation` WHERE `provider_id`=0x02000000000000000000000000000000 and `reservation_date` LIKE '2024-11-29%';

}
