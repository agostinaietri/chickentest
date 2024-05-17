package com.javasharks.chickentest.service;


import com.javasharks.chickentest.model.Egg;

import java.util.List;
import java.util.Optional;

public interface EggService {
    Egg saveEgg(Egg egg);
    Optional<Egg> getEggById(Long eggId);
    List<Egg> getAllEggs();
    Optional<Egg> updateEgg(Egg egg, Long eggId);
    void deleteEggById(Long eggId);
}
