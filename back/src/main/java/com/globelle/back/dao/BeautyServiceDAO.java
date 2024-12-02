package com.globelle.back.dao;

import com.globelle.back.model.BeautyService;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BeautyServiceDAO extends CrudRepository<BeautyService, Integer> {

    @Query(value = "SELECT * FROM beauty_service b JOIN user_role r ON r.user_id = b.user_id WHERE b.user_id = :userId AND r.role_id = 1", nativeQuery = true)
    List<BeautyService> findByProviderId(@Param("userId") int userId);


}
