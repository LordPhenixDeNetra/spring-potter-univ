package com.potter.potteruniv.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "Fan")
@NoArgsConstructor
@Setter
@Getter
public class Fan extends Personne{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "personneId")
    private Personne personne;

    @ManyToOne
    @JoinColumn(name = "ecoleId")
    private Ecole ecole;

    @ManyToOne
    @JoinColumn(name = "maisonId")
    private Maison maison;

    @Column(length = 150)
    private String email;

    private String password;

    private String username;

    private String profile;

    private Date createdAt;

    private Date editedAt;
}
