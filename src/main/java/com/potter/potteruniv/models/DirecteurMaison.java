package com.potter.potteruniv.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "DirecteurMaison")
@Setter
@Getter
@NoArgsConstructor
public class DirecteurMaison extends Personne{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne // Indique qu'il s'agit d'une relation Many-to-One (clé étrangère)
    @JoinColumn(name = "personneId") // Nom de la colonne de la clé étrangère dans la table EntityA
    private Personne personne;

    @ManyToOne
    @JoinColumn(name = "maisonId")
    private Maison maison;


    private Date debutDirecteurMaison;

    private Date finDirecteurMaison;

    private Date createdAt;

    private Date editedAt;
}
