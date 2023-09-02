package com.potter.potteruniv.models;


import com.potter.potteruniv.enums.OtherType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "OtherPersonne")
@NoArgsConstructor
@Setter
@Getter
public class OtherPersonne extends Personne{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "personneId")
    private Personne personne;

    @Enumerated
    private OtherType otherType;

    private Date createdAt;

    private Date editedAt;
}
