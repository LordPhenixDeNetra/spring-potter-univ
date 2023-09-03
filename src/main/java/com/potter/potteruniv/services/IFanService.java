package com.potter.potteruniv.services;

import com.potter.potteruniv.models.Fan;

import java.util.List;

public interface IFanService {

    public Fan createFan(Fan fan);

    public List<Fan> readFan();

    public Fan updateFan(Long id, Fan fan);

    public String deleteFan(Long id);
}
