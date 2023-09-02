package com.potter.potteruniv.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "Eleve")
@NoArgsConstructor
@Setter
@Getter
public class Eleve extends Personne{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "personneId")
    private Personne personne;

    @ManyToOne
    @JoinColumn(name = "maisonId")
    private Maison maison;

    @ManyToOne
    @JoinColumn(name = "ecoleId")
    private Ecole ecole;

    private Date debutEtude;

    private Date finEtude;

    private Date createdAt;

    private Date editedAt;



}
