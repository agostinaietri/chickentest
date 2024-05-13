package com.javasharks.chickentest.repository;

import com.javasharks.chickentest.model.Chicken;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChickenRepository extends CrudRepository<Chicken, Long> {
}
