package com.sergio.foodRecord.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SintomasDTO {
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
}
