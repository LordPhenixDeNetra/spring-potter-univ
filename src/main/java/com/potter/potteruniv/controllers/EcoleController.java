package com.potter.potteruniv.controllers;

import com.potter.potteruniv.models.Ecole;
import com.potter.potteruniv.services.IEcoleServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Ecole")
public class EcoleController {

    private final IEcoleServiceImpl ecoleService;

    @PostMapping("/createEcole")
    public Ecole createEcole(@RequestBody Ecole ecole){
        return ecoleService.crateEcole(ecole);
    }

    @GetMapping
    public List<Ecole> readEcole(){
        return ecoleService.readEcole();
    }

    @PutMapping("/updateEcole/{id}")
    public Ecole updateEcole(@PathVariable Long id, @RequestBody Ecole ecole){
        return ecoleService.updateEcole(id, ecole);
    }

    @DeleteMapping("/deleteEcole/{id}")
    public String deleteEcole(@PathVariable Long id){
        return ecoleService.deleteEcole(id);
    }

}
