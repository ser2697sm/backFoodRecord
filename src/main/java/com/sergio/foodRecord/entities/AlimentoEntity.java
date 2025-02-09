package com.sergio.foodRecord.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "alimentos")
public class AlimentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alimento")
    private Long idAlimento;

    @Column(name = "nombre_alimento", nullable = false)
    private String nombreAlimento;

    private byte porcion;

    private String ingesta;

    @Column(name = "fecha_de_toma")
    private LocalDate fechaDeToma;

    @OneToMany(
           // mappedBy = "alimento",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
           // orphanRemoval = true
    )
    private Set<SintomasEntity> sintomas;
}
