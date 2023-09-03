package com.potter.potteruniv.repository;

import com.potter.potteruniv.models.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne, Long> {
}
