package com.potter.potteruniv.services;

import com.potter.potteruniv.models.Maison;

import java.util.List;

public interface IMaisonService {

    public Maison createMaison(Maison maison);

    public List<Maison> readMaison();

    public Maison updateMaison(Long id, Maison maison);

    public String deleteMaison(Long id);
}
