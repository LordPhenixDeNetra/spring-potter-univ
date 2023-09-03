package com.potter.potteruniv.services;

import com.potter.potteruniv.models.Eleve;

import java.util.List;

public interface IEleveService {

    public Eleve createEleve(Eleve eleve);

    public List<Eleve> readEleve();

    public Eleve updateEleve(Long id, Eleve eleve);

    public String deleteEleve(Long id);

}
