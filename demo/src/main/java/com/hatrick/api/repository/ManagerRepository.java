package com.hatrick.api.repository;

import com.hatrick.api.model.Manager;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ManagerRepository extends CrudRepository<Manager, Long> {
    List<Manager> findByNameContainingIgnoreCase(String name);
    List<Manager> findByNameLike(String name);

}
