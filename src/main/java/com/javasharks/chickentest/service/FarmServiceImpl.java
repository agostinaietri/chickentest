package com.javasharks.chickentest.service;

import com.javasharks.chickentest.model.Farm;
import com.javasharks.chickentest.repository.FarmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class FarmServiceImpl implements FarmService {

    @Autowired
    private FarmRepository farmRepository;

    @Override
    public Farm saveFarm(Farm farm) {
        return farmRepository.save(farm);
    }

    @Override
    public Farm getFarmById() {
        return null;
    }

    public Optional<Farm> getFarmById(Long farmId) {
        return farmRepository.findById(farmId);
    }

    @Override
    public Optional<Farm> updateFarm(Farm farm, Long farmId) {
        Optional<Farm> existingFarm = farmRepository.findById(farmId);

        //no checking for nulls is needed since NotBlank is present in model
        existingFarm.get().setName(farm.getName());
        existingFarm.get().setCattle(farm.getCattle());
        return existingFarm;
    }

    @Override
    public void deleteFarmById(Long farmId) {
        farmRepository.deleteById(farmId);
    }
}
