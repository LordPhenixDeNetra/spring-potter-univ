package com.potter.potteruniv.controllers;

import com.potter.potteruniv.models.Maison;
import com.potter.potteruniv.services.IMaisonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Maison")
public class MaisonController {

    private IMaisonService maisonService;

    @PostMapping("/createMaison")
    public Maison createMaison(@RequestBody Maison maison){
        return maisonService.createMaison(maison);
    }

    @GetMapping
    public List<Maison> readMaison(){
        return maisonService.readMaison();
    }

    @PutMapping("/updateMaison/{id}")
    public Maison updateMaison(@PathVariable Long id, @RequestBody Maison maison){
        return maisonService.updateMaison(id, maison);
    }

    @DeleteMapping("/deleteMaison/{id}")
    public String deleteMaison(@PathVariable Long id){
        return maisonService.deleteMaison(id);
    }
}
