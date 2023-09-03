package com.potter.potteruniv.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "Ecole")
@Getter
@Setter
@NoArgsConstructor
public class Ecole{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String uidEcole;

    @Column(length = 60)
    private String nomEcole;

    private String descriptionEcole;

    @Column(length = 60)
    private String lieuEcole;

    private Date createdAt;

    private Date editedAt;

}
