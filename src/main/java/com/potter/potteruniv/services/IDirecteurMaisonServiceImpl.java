package com.potter.potteruniv.services;

import com.potter.potteruniv.models.DirecteurMaison;
import com.potter.potteruniv.repository.DirecteurMaisonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class IDirecteurMaisonServiceImpl implements IDirecteurMaisonService{

    private DirecteurMaisonRepository directeurMaisonRepository;

    @Override
    public DirecteurMaison createDirecteurMaison(DirecteurMaison directeurMaison) {
        return directeurMaisonRepository.save(directeurMaison);
    }

    @Override
    public List<DirecteurMaison> readDirecteurMaison() {
        return directeurMaisonRepository.findAll();
    }

    @Override
    public DirecteurMaison updateDirecteurMaison(Long id, DirecteurMaison directeurMaison) {
        return directeurMaisonRepository.findById(id)
                .map(dm->{
                    dm.setMaison(directeurMaison.getMaison());
                    dm.setPersonne(directeurMaison.getPersonne());
                    dm.setDebutDirecteurMaison(directeurMaison.getDebutDirecteurMaison());
                    dm.setFinDirecteurMaison(directeurMaison.getFinDirecteurMaison());
                    dm.setCreatedAt(directeurMaison.getCreatedAt());
                    dm.setEditedAt(new Date());
                    return directeurMaisonRepository.save(dm);
                }).orElseThrow(()->new RuntimeException("Updated Abort"));

    }

    @Override
    public String deleteDirecteurMaison(Long id) {
        directeurMaisonRepository.deleteById(id);
        return "Deleted Directeur Maison";
    }
}
