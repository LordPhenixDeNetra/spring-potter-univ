package com.potter.potteruniv.services;

import com.potter.potteruniv.models.DirecteurEcole;
import com.potter.potteruniv.repository.DirecteurEcoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class IDirecteurEcoleServiceImpl implements IDirecteurEcoleService{

    private final DirecteurEcoleRepository directeurEcoleRepository;

    @Override
    public DirecteurEcole createDirecteurEcole(DirecteurEcole directeurEcole) {
        return directeurEcoleRepository.save(directeurEcole);
    }

    @Override
    public List<DirecteurEcole> readDirecteurEcole() {
        return directeurEcoleRepository.findAll();
    }

    @Override
    public DirecteurEcole updateDirecteurEcole(Long id, DirecteurEcole directeurEcole) {
        return directeurEcoleRepository.findById(id)
                .map(de ->{
                    de.setPersonne(directeurEcole.getPersonne());
                    de.setDebutDirecteur(directeurEcole.getDebutDirecteur());
                    de.setFinDirecteur(directeurEcole.getFinDirecteur());
                    de.setCreatedAt(directeurEcole.getCreatedAt());
                    de.setEditedAt(new Date());

                    return directeurEcoleRepository.save(de);
                }).orElseThrow(()->new RuntimeException("Updated Directer Ecole"));


    }

    @Override
    public String deleteDirecteurEcole(Long id) {
        directeurEcoleRepository.deleteById(id);
        return "Deleted Directeur Ecole";
    }
}
