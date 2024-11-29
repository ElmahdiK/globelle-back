package com.globelle.back.dao;

import com.globelle.back.model.BeautyService;
import com.globelle.back.model.Provider;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ProviderDAO extends CrudRepository<Provider, Integer> {

    @Query(value = "SELECT p.* FROM provider p JOIN beauty_service b ON p.id = b.provider_id WHERE b.name = :name", nativeQuery = true)
    List<Provider> findProviderByBeautyServicesName(@Param("name") String name);

}
