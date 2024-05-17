package com.javasharks.chickentest.service;

import com.javasharks.chickentest.model.Chicken;
import com.javasharks.chickentest.model.Farm;

import java.util.List;
import java.util.Optional;

public interface ChickenService {
    Chicken saveChicken(Chicken chicken);
    Optional<Chicken> getChickenById(Long chickenId);
    List<Chicken> getAllChicken();
    Optional<Chicken> updateChicken(Chicken chicken, Long chickenId);
    void deleteChickenById(Long chickenId);
}
