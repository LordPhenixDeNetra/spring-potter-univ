package com.potter.potteruniv.controllers;

import com.potter.potteruniv.models.Eleve;
import com.potter.potteruniv.services.IEleveService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Eleve")
public class EleveController {
    
    private final IEleveService eleveService;

    @PostMapping("/createEleve")
    public Eleve createEleve(Eleve eleve){
        return eleveService.createEleve(eleve);
    }

    @GetMapping
    public List<Eleve> readEleve(){
        return eleveService.readEleve();
    }

    @PutMapping("/updateEleve/{id}")
    public Eleve updateEleve(@PathVariable Long id, @RequestBody Eleve eleve){
        return eleveService.updateEleve(id, eleve);
    }

    @DeleteMapping("/deleteEleve/{id}")
    public String deleteEleve(@PathVariable Long id){
        return eleveService.deleteEleve(id);
    }
}
