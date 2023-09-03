package com.potter.potteruniv.controllers;


import com.potter.potteruniv.models.OtherPersonne;
import com.potter.potteruniv.services.IOtherPersonneService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/OtherPersonne")
public class OtherPersonneController {
    
    private IOtherPersonneService otherPersonneService;

    @PostMapping("/createOtherPersonne")
    public OtherPersonne createOtherPersonne(@RequestBody OtherPersonne otherPersonne){
        return otherPersonneService.createOtherPersonne(otherPersonne);
    }

    @GetMapping
    public List<OtherPersonne> readOtherPersonne(){
        return otherPersonneService.readOtherPersonne();
    }

    @PutMapping("/updateOtherPersonne/{id}")
    public OtherPersonne updateOtherPersonne(@PathVariable Long id, @RequestBody OtherPersonne otherPersonne){
        return otherPersonneService.updateOtherPersonne(id, otherPersonne);
    }

    @DeleteMapping("/deleteOtherPersonne/{id}")
    public String deleteOtherPersonne(@PathVariable Long id){
        return otherPersonneService.deleteOtherPersonne(id);
    }
    
}
