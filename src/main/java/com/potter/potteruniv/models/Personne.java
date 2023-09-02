package com.potter.potteruniv.models;

import com.potter.potteruniv.enums.PersonneType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "Personne")
@Setter
@Getter
@NoArgsConstructor
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String UUIDPersonne;

    @Column(length = 50)
    private String nomPersonne;

    @Column(length = 50)
    private String prenomPersonne;

    private Date naissance;

    @Column(length = 50)
    private String lieuNaissance;

    @Column(length = 150)
    private String baguette;

    @Column(length = 50)
    private String patronus;

    @Column(length = 50)
    private String animalCompagnie;

    private boolean animagus;

    @Column(length = 50)
    private String animalForme;

    private String avatar;

    @Enumerated
    private PersonneType personneType;

    private Date createdAt;

    private Date editedAt;

}
