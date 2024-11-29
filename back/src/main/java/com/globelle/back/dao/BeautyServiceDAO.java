package com.globelle.back.dao;

import com.globelle.back.model.BeautyService;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BeautyServiceDAO extends CrudRepository<BeautyService, Integer> {

    @Query(value = "SELECT * FROM beauty_service b WHERE b.provider_id = :providerId", nativeQuery = true)
    List<BeautyService> findByProviderId(@Param("providerId") int providerId);


}
