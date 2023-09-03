package com.potter.potteruniv.services;

import com.potter.potteruniv.models.Personne;

import java.util.List;

public interface IPersonneService {

    public Personne createPersonne(Personne personne);

    public List<Personne> readPersonne();

    public Personne updatePersonne(Long id, Personne personne);

    public String deletePersonne(Long id);


}
