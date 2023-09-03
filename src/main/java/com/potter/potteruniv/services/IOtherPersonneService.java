package com.potter.potteruniv.services;

import com.potter.potteruniv.models.OtherPersonne;

import java.util.List;

public interface IOtherPersonneService {

    public OtherPersonne createOtherPersonne(OtherPersonne otherPersonne);

    public List<OtherPersonne> readOtherPersonne();

    public OtherPersonne updateOtherPersonne(Long id, OtherPersonne otherPersonne);

    public String deleteOtherPersonne(Long id);

}
