package com.globelle.back.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.globelle.back.model.Role;

// See: https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
public interface RoleDao extends CrudRepository<Role, Integer> {

    Optional<Role> findByName(String name);

}