package com.globelle.back.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.globelle.back.model.User;
import org.springframework.data.repository.query.Param;

// See: https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
public interface UserDAO extends CrudRepository<User, Integer> {

    Optional<User> findByUsername(String username);

    Optional<User> findByUsernameOrEmail(String username, String email);

    @Query(value = "SELECT u.* FROM user u JOIN user_role r ON u.id = r.user_id WHERE r.role_id = 1", nativeQuery = true)
    List<User> findAllProviders();

    @Query(value = "SELECT u.* FROM user u INNER JOIN beauty_service b ON b.user_id = u.id AND b.name LIKE %:name%", nativeQuery = true)
    List<User> findUserByBeautyServicesName(@Param("name") String name);

}