package com.potter.potteruniv.controllers;

import com.potter.potteruniv.models.Fan;
import com.potter.potteruniv.services.IFanService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/FanController")
public class FanController {
    
    private final IFanService fanService;

    @PostMapping("/createFan")
    public Fan createFan(Fan fan){
        return fanService.createFan(fan);
    }

    @GetMapping
    public List<Fan> readFan(){
        return fanService.readFan();
    }

    @PutMapping("/updateFan/{id}")
    public Fan updateFan(@PathVariable Long id, @RequestBody Fan fan){
        return fanService.updateFan(id, fan);
    }

    @DeleteMapping("/deleteFan/{id}")
    public String deleteFan(@PathVariable Long id){
        return fanService.deleteFan(id);
    }
    
}
