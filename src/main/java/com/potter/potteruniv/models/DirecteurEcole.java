package com.potter.potteruniv.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "DirecteurEcole")
@NoArgsConstructor
@Getter
@Setter
public class DirecteurEcole extends Personne{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "personneId")
    private Personne personne;

    private Date debutDirecteur;

    private Date finDirecteur;

    private Date createdAt;

    private Date editedAt;


}
