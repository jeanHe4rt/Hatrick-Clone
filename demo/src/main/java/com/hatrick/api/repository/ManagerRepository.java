package com.hatrick.api.repository;

import com.hatrick.api.model.Manager;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ManagerRepository extends CrudRepository<Manager, Long> {
    List<Manager> findByName(String name);
}
