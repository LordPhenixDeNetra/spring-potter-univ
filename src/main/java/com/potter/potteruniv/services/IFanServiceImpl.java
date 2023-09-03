package com.potter.potteruniv.services;

import com.potter.potteruniv.models.Ecole;
import com.potter.potteruniv.models.Fan;
import com.potter.potteruniv.models.Maison;
import com.potter.potteruniv.models.Personne;
import com.potter.potteruniv.repository.FanRepository;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class IFanServiceImpl implements IFanService{

    private final FanRepository fanRepository;

    @Override
    public Fan createFan(Fan fan) {
        return fanRepository.save(fan);
    }

    @Override
    public List<Fan> readFan() {
        return fanRepository.findAll();
    }

    @Override
    public Fan updateFan(Long id, Fan fan) {
        return fanRepository.findById(id)
            .map(f ->{
                f.setPersonne(fan.getPersonne());
                f.setEcole(fan.getEcole());
                f.setMaison(fan.getMaison());
                f.setEmail(fan.getEmail());
                f.setPassword(fan.getPassword());
                f.setUsername(fan.getUsername());
                f.setProfile(fan.getProfile());
                f.setCreatedAt(fan.getCreatedAt());
                f.setEditedAt(new Date());

                return fanRepository.save(f);

            }).orElseThrow(()->new RuntimeException("Updated Fan"));

    }

    @Override
    public String deleteFan(Long id) {
        fanRepository.deleteById(id);
        return "Deleted Fan";
    }
}
