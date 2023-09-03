package com.potter.potteruniv.services;

import com.potter.potteruniv.models.OtherPersonne;
import com.potter.potteruniv.repository.OtherPersonneRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class IOtherPersonneServiceImpl implements IOtherPersonneService{

    private final OtherPersonneRepository otherPersonneRepository;

    @Override
    public OtherPersonne createOtherPersonne(OtherPersonne otherPersonne) {
        return otherPersonneRepository.save(otherPersonne);
    }

    @Override
    public List<OtherPersonne> readOtherPersonne() {
        return otherPersonneRepository.findAll();
    }

    @Override
    public OtherPersonne updateOtherPersonne(Long id, OtherPersonne otherPersonne) {
        return otherPersonneRepository.findById(id)
            .map(otP ->{
                otP.setPersonne(otherPersonne.getPersonne());
                otP.setOtherType(otherPersonne.getOtherType());
                otP.setCreatedAt(otherPersonne.getCreatedAt());
                otP.setEditedAt(new Date());

                return otherPersonneRepository.save(otP);
            }).orElseThrow(()->new RuntimeException("Update Abort"));
    }

    @Override
    public String deleteOtherPersonne(Long id) {
        otherPersonneRepository.deleteById(id);
        return "Deleted OtherPersonne";
    }
}
