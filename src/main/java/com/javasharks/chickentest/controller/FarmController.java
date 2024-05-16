package com.javasharks.chickentest.controller;

import com.javasharks.chickentest.model.Farm;
import com.javasharks.chickentest.service.FarmService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/farm")
public class FarmController {

    @Autowired
    private FarmService farmService;

    @PostMapping("/create")
    public Farm saveFarm(@Valid @RequestBody Farm farm) {
        return farmService.saveFarm(farm);
    }

    @GetMapping("/{farmId}")
    public Optional<Farm> getFarmById(@PathVariable("farmId") Long farmId) {
        return farmService.getFarmById(farmId);
    }

    @PutMapping("/update/{farmId}")
    public Optional<Farm> updateFarm(@RequestBody Farm farm, @PathVariable("farmId") Long farmId) {
        return farmService.updateFarm(farm, farmId);
    }

    @DeleteMapping("/{farmId}")
    public String deleteFarmById(@PathVariable("farmId") Long farmId) {
        farmService.deleteFarmById(farmId);
        return "Farm " + farmId + " has been deleted";
    }

}
