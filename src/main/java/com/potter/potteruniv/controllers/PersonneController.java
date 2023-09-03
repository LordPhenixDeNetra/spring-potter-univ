package com.potter.potteruniv.controllers;

import com.potter.potteruniv.models.Personne;
import com.potter.potteruniv.services.IPersonneService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Personne")
public class PersonneController {

    private IPersonneService personneService;

    @PostMapping("/createPersonne")
    public Personne createPersonne(@RequestBody Personne personne){
        return personneService.createPersonne(personne);
    }

    @GetMapping
    public List<Personne> readPersonne(){
        return personneService.readPersonne();
    }

    @PutMapping("/updatePersonne/{id}")
    public Personne updatePersonne(@PathVariable Long id, @RequestBody Personne personne){
        return personneService.updatePersonne(id, personne);
    }

    @DeleteMapping("/deletePersonne/{id}")
    public String deletePersonne(@PathVariable Long id){
        return personneService.deletePersonne(id);
    }
}
