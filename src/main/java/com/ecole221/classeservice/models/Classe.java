package com.ecole221.classeservice.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Classe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String libelle;

    @Column(nullable = false)
    private int fraisInscription;

    @Column(nullable = false)
    private int mensualite;

    @Column(nullable = false)
    private int autresFrais;

    @ManyToOne
    @JoinColumn(name = "filiere_id")
    private Filiere filiere;
}
