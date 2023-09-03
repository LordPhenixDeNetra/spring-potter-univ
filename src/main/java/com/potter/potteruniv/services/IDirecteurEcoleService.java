package com.potter.potteruniv.services;

import com.potter.potteruniv.models.DirecteurEcole;

import java.util.List;

public interface IDirecteurEcoleService {

    public DirecteurEcole createDirecteurEcole(DirecteurEcole directeurEcole);

    public List<DirecteurEcole> readDirecteurEcole();

    public DirecteurEcole updateDirecteurEcole(Long id, DirecteurEcole directeurEcole);

    public String deleteDirecteurEcole(Long id);
    
}
