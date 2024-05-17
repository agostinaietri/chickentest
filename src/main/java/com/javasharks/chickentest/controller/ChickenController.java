package com.javasharks.chickentest.controller;

import com.javasharks.chickentest.model.Chicken;
import com.javasharks.chickentest.model.Farm;
import com.javasharks.chickentest.service.ChickenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/chicken")
public class ChickenController {

    @Autowired
    private ChickenService chickenService;

    @PostMapping("/create")
    public Chicken saveChicken(@Valid @RequestBody Chicken chicken) {
        return chickenService.saveChicken(chicken);
    }

    @GetMapping("/{chickenId}")
    public Optional<Chicken> getChickenById(@PathVariable("chickenId") Long chickenId) {
        return chickenService.getChickenById(chickenId);
    }

    @GetMapping("/all")
    public List<Chicken> getAllChicken() {
        return chickenService.getAllChicken();
    }


    @PutMapping("/update/{chickenId}")
    public Optional<Chicken> updateFarm(@RequestBody Chicken chicken, @PathVariable("chickenId") Long chickenId) {
        return chickenService.updateChicken(chicken, chickenId);
    }

    @DeleteMapping("/delete/{chickenId}")
    public String deleteChickenById(@PathVariable("chickenId") Long chickenId) {
        chickenService.deleteChickenById(chickenId);
        return "Chicken " + chickenId + " has been deleted";
    }

}
