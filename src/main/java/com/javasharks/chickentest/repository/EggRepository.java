package com.javasharks.chickentest.repository;

import com.javasharks.chickentest.model.Egg;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EggRepository extends CrudRepository<Egg, Long> {
}
