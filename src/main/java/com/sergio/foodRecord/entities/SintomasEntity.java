package com.sergio.foodRecord.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sintomas")
public class SintomasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    private Date fechaRegistro;

    @ManyToOne(targetEntity = AlimentoEntity.class)
    @JoinColumn(name = "id_alimento")
    private AlimentoEntity alimento;
}
