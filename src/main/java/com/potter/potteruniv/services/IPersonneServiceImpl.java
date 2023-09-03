package com.potter.potteruniv.services;

import com.potter.potteruniv.models.Personne;
import com.potter.potteruniv.repository.PersonneRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class IPersonneServiceImpl implements IPersonneService{

    private final PersonneRepository personneRepository;

    @Override
    public Personne createPersonne(Personne personne) {
        return personneRepository.save(personne);
    }

    @Override
    public List<Personne> readPersonne() {
        return personneRepository.findAll();
    }

    @Override
    public Personne updatePersonne(Long id, Personne personne) {
        return personneRepository.findById(id)
            .map(p ->{
                p.setNomPersonne(personne.getNomPersonne());
                p.setPrenomPersonne(personne.getPrenomPersonne());
                p.setNaissance(personne.getNaissance());
                p.setLieuNaissance(personne.getLieuNaissance());
                p.setPatronus(personne.getPatronus());
                p.setAnimagus(personne.isAnimagus());
                p.setAnimalForme(personne.getAnimalForme());
                p.setAvatar(personne.getAvatar());
                p.setBaguette(personne.getBaguette());
                p.setPersonneType(personne.getPersonneType());
                p.setAnimalCompagnie(personne.getAnimalCompagnie());
                p.setCreatedAt(personne.getCreatedAt());
                p.setEditedAt(new Date());

                return personneRepository.save(p);

            }).orElseThrow(() -> new RuntimeException("Update Abort !"));
    }

    @Override
    public String deletePersonne(Long id) {

        personneRepository.deleteById(id);
        return "Deleted Personne !";
    }
}
