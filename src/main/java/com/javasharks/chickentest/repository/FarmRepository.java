package com.javasharks.chickentest.repository;


import com.javasharks.chickentest.model.Farm;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmRepository extends CrudRepository<Farm, Long> {
}
