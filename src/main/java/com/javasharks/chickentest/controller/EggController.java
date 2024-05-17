package com.javasharks.chickentest.controller;


import com.javasharks.chickentest.model.Chicken;
import com.javasharks.chickentest.model.Egg;
import com.javasharks.chickentest.service.EggService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/egg")
public class EggController {

    @Autowired
    private EggService eggService;

    @PostMapping("/create")
    public Egg saveEgg(@Valid @RequestBody Egg egg) {
        return eggService.saveEgg(egg);
    }

    @GetMapping("/{eggId}")
    public Optional<Egg> getEggById(@PathVariable("eggId") Long eggId) {
        return eggService.getEggById(eggId);
    }

    @GetMapping("/all")
    public List<Egg> getAllEggs() {
        return eggService.getAllEggs();
    }


    @PutMapping("/update/{eggId}")
    public Optional<Egg> updateEgg(@RequestBody Egg egg, @PathVariable("eggId") Long eggId) {
        return eggService.updateEgg(egg, eggId);
    }

    @DeleteMapping("/delete/{eggId}")
    public String deleteEggById(@PathVariable("eggId") Long eggId) {
        eggService.deleteEggById(eggId);
        return "Egg " + eggId + " has been deleted";
    }

}
