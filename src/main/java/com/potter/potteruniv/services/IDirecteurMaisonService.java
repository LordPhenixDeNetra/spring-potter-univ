package com.potter.potteruniv.services;

import com.potter.potteruniv.models.DirecteurMaison;

import java.util.List;

public interface IDirecteurMaisonService {

    public DirecteurMaison createDirecteurMaison(DirecteurMaison directeurMaison);

    public List<DirecteurMaison> readDirecteurMaison();

    public DirecteurMaison updateDirecteurMaison(Long id, DirecteurMaison directeurMaison);

    public String deleteDirecteurMaison(Long id);
}
