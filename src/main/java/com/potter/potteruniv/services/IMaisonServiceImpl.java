package com.potter.potteruniv.services;

import com.potter.potteruniv.models.Maison;
import com.potter.potteruniv.repository.MaisonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class IMaisonServiceImpl implements IMaisonService{

    private final MaisonRepository maisonRepository;

    @Override
    public Maison createMaison(Maison maison) {
        return maisonRepository.save(maison);
    }

    @Override
    public List<Maison> readMaison() {
        return maisonRepository.findAll();
    }

    @Override
    public Maison updateMaison(Long id, Maison maison) {
        return maisonRepository.findById(id)
            .map(m->{
                m.setNomMaison(maison.getNomMaison());
                m.setHymneMaison(maison.getHymneMaison());
                m.setEcole(maison.getEcole());
                m.setCreatedAt(maison.getCreatedAt());
                m.setEditedAt(new Date());
                m.setDescriptionMaison(maison.getDescriptionMaison());
                m.setPersonne(maison.getPersonne());

                return maisonRepository.save(m);
            }).orElseThrow(() -> new RuntimeException("Update Abort !"));
    }

    @Override
    public String deleteMaison(Long id) {
        maisonRepository.deleteById(id);
        return "Deleted Maison";
    }
}
