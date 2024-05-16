package com.javasharks.chickentest.service;

import com.javasharks.chickentest.model.Farm;
import com.javasharks.chickentest.repository.FarmRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

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
    public Optional<Farm> getFarmById(Long farmId) {
        return farmRepository.findById(farmId);
    }


    @Override
    @Transactional(readOnly=false)
    public Optional<Farm> updateFarm(@Valid @RequestBody Farm farm, @PathVariable Long id) {
        if (farmRepository.existsById(id)) {
            farm.setId(id);
            farm.setName(farm.getName());
            farm.setCattle(farm.getCattle());
            farmRepository.save(farm);
            return Optional.of(farm);
        } else {
            return Optional.empty();
        }
    }

    @Override
    public void deleteFarmById(Long farmId) {
        farmRepository.deleteById(farmId);
    }
}
