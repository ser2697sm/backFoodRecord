package com.sergio.foodRecord.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@Entity
@Table(name = "alimentos")
public class AlimentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAlimento;

    @Column(name = "nombre_alimento")
    private String nombreAlimento;

    private byte porcion;

    private LocalDate FechaDeToma;

    @OneToMany(
            targetEntity = SintomasEntity.class,
            fetch = FetchType.EAGER,
            mappedBy = "alimento",
            cascade = CascadeType.ALL
    )
   private List<SintomasEntity> sintomas;
}
