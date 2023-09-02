package com.potter.potteruniv.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "Maison")
@Getter
@Setter
@NoArgsConstructor
public class Maison {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String UUIDMaison;

    @Column(length = 50)
    private String nomMaison;

    @Column
    private String hymneMaison;

    @Column
    private String descriptionMaison;

    @ManyToOne
    @JoinColumn(name = "createurId")
    private Personne personne;

    @ManyToOne
    @JoinColumn(name = "ecoleId")
    private Ecole ecole;

    private Date createdAt;

    private Date editedAt;

}
