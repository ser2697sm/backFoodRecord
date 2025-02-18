package com.sergio.foodRecord.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AlimentoDTO {
    private String nombreAlimento;
    private byte porcion;
    private LocalDate fechaDeToma;
}
