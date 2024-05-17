package com.javasharks.chickentest.service;

import com.javasharks.chickentest.model.Chicken;
import com.javasharks.chickentest.model.Farm;
import com.javasharks.chickentest.repository.ChickenRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class ChickenServiceImpl implements ChickenService {

    @Autowired
    private ChickenRepository chickenRepository;

    @Override
    public Chicken saveChicken(Chicken chicken) {
        return chickenRepository.save(chicken);
    }

    @Override
    public Optional<Chicken> getChickenById(Long chickenId) {
        return chickenRepository.findById(chickenId);
    }

    @Override
    public List<Chicken> getAllChicken() {
        List<Chicken> chicken = (List<Chicken>) chickenRepository.findAll();
        return chicken;
    }


    @Override
    @Transactional(readOnly=false)
    public Optional<Chicken> updateChicken(@Valid @RequestBody Chicken chicken, @PathVariable Long id) {
        if (chickenRepository.existsById(id)) {
            chicken.setId(id);
            chicken.setPrice(chicken.getPrice());
            return Optional.of(chicken);
        } else {
            return Optional.empty();
        }
    }

    @Override
    public void deleteChickenById(Long chickenId) {
        chickenRepository.deleteById(chickenId);
    }
}
