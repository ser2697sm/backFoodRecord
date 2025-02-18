package com.sergio.foodRecord.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "sintomas")
public class SintomasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sintomas")
    private Long idSintomas;

    private byte dolorAbdominal;
    private byte distensionyGases;
    private byte nDeposiciones;
    private byte consistenciasHeces;
    private byte digestionPesada;
    private byte dolorPecho;
    private byte antojos;
    private byte dolorMuscular;
    private byte nivelEnergia;
    private byte cefaleaOMigrana;
    private byte estadoAnimo;
    private byte estres;
    private String otros;
    @Column(unique = true)
    private LocalDate fechaSintoma;
}
