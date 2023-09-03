package com.potter.potteruniv.services;

import com.potter.potteruniv.models.Eleve;
import com.potter.potteruniv.repository.EleveRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class IEleveServiceImpl implements IEleveService{

    private EleveRepository eleveRepository;

    @Override
    public Eleve createEleve(Eleve eleve) {
        return eleveRepository.save(eleve);
    }

    @Override
    public List<Eleve> readEleve() {
        return eleveRepository.findAll();
    }

    @Override
    public Eleve updateEleve(Long id, Eleve eleve) {
        return eleveRepository.findById(id)
            .map(e ->{
                e.setPersonne(eleve.getPersonne());
                e.setEcole(eleve.getEcole());
                e.setMaison(eleve.getMaison());
                e.setDebutEtude(eleve.getDebutEtude());
                e.setFinEtude(eleve.getFinEtude());
                e.setCreatedAt(eleve.getCreatedAt());
                e.setEditedAt(new Date());

                return eleveRepository.save(e);
            }).orElseThrow(()->new RuntimeException("Update Abort"));
    }

    @Override
    public String deleteEleve(Long id) {
        eleveRepository.deleteById(id);
        return "Deleted Eleve";
    }
}
