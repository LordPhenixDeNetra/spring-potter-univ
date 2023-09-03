package com.potter.potteruniv.services;

import com.potter.potteruniv.models.Ecole;
import com.potter.potteruniv.repository.EcoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class IEcoleServiceImpl implements IEcoleService{

    private EcoleRepository ecoleRepository;
    @Override
    public Ecole crateEcole(Ecole ecole) {
        return ecoleRepository.save(ecole);
    }

    @Override
    public List<Ecole> readEcole() {
        return ecoleRepository.findAll();
    }

    @Override
    public Ecole updateEcole(Long id, Ecole ecole) {
        return ecoleRepository.findById(id)
            .map(e ->{
                e.setNomEcole(ecole.getNomEcole());
                e.setLieuEcole(ecole.getLieuEcole());
                e.setDescriptionEcole(ecole.getDescriptionEcole());
                e.setEditedAt(new Date());
                e.setCreatedAt(e.getCreatedAt());

                return ecoleRepository.save(e);
            }).orElseThrow(()->new RuntimeException("Update Abort"));
    }

    @Override
    public String deleteEcole(Long id) {
        ecoleRepository.deleteById(id);
        return "Deleted Ecole";
    }
}
