package com.potter.potteruniv.controllers;

import com.potter.potteruniv.models.DirecteurEcole;
import com.potter.potteruniv.services.IDirecteurEcoleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/DirecteurEcole")
public class DirecteurEcoleController {

    private final IDirecteurEcoleService directeurEcoleService;

    @PostMapping("/createDirecteurEcole")
    public DirecteurEcole createDirecteurEcole(DirecteurEcole directeurEcole){
        return directeurEcoleService.createDirecteurEcole(directeurEcole);
    }

    @GetMapping
    public List<DirecteurEcole> readDirecteurEcole(){
        return directeurEcoleService.readDirecteurEcole();
    }

    @PutMapping("/updateDirecteurEcole/{id}")
    public DirecteurEcole updateDirecteurEcole(@PathVariable Long id, @RequestBody DirecteurEcole directeurEcole){
        return directeurEcoleService.updateDirecteurEcole(id, directeurEcole);
    }

    @DeleteMapping("/deleteDirecteurEcole/{id}")
    public String deleteDirecteurEcole(@PathVariable Long id){
        return directeurEcoleService.deleteDirecteurEcole(id);
    }
}
