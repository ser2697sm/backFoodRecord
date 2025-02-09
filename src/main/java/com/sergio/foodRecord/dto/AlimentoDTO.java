package com.sergio.foodRecord.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class AlimentoDTO {
    private String nombreAlimento;
    private byte porcion;
    private LocalDate fechaDeToma;
}
