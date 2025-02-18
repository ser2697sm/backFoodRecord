package com.sergio.foodRecord.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AlimentoDTO {
    private Long id;
    private String nombreAlimento;
    private String ingesta;
    private LocalDate fechaDeToma;
}
