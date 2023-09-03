package com.potter.potteruniv.repository;

import com.potter.potteruniv.models.DirecteurEcole;
import com.potter.potteruniv.models.DirecteurMaison;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirecteurMaisonRepository extends JpaRepository<DirecteurMaison, Long> {
}
