package com.potter.potteruniv.services;

import com.potter.potteruniv.models.Ecole;

import java.util.List;

public interface IEcoleService {

    public Ecole crateEcole(Ecole ecole);

    public List<Ecole> readEcole();

    public Ecole updateEcole(Long id, Ecole ecole);

    public String deleteEcole(Long id);

}
