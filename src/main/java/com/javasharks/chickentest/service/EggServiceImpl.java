package com.javasharks.chickentest.service;

import com.javasharks.chickentest.model.Egg;
import com.javasharks.chickentest.repository.EggRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class EggServiceImpl implements EggService {

    @Autowired
    private EggRepository eggRepository;

    @Override
    public Egg saveEgg(Egg egg) {
        return eggRepository.save(egg);
    }

    @Override
    public Optional<Egg> getEggById(Long eggId) {
        return eggRepository.findById(eggId);
    }

    @Override
    public List<Egg> getAllEggs() {
        return (List<Egg>) eggRepository.findAll();
    }

    @Override
    @Transactional(readOnly=false)
    public Optional<Egg> updateEgg(@Valid @RequestBody Egg egg, @PathVariable Long id) {
        if (eggRepository.existsById(id)) {
            egg.setId(id);
            egg.setPrice(egg.getPrice());
            return Optional.of(egg);
        } else {
            return Optional.empty();
        }
    }

    @Override
    public void deleteEggById(Long eggId) {
        eggRepository.deleteById(eggId);
    }
}
