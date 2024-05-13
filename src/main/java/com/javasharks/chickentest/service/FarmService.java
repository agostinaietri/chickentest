package com.javasharks.chickentest.service;

import com.javasharks.chickentest.model.Farm;

import java.util.Optional;

public interface FarmService {
    Farm saveFarm(Farm Farm);
    Farm getFarmById();
    Optional<Farm> updateFarm(Farm Farm, Long FarmId);
    void deleteFarmById(Long FarmId);
}
