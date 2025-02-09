package com.sergio.foodRecord.services.AlimentosService;


import com.sergio.foodRecord.entities.AlimentoEntity;

import java.time.LocalDate;
import java.util.List;

public interface AlimentoService {
    List<AlimentoEntity> allAlimentos();

    AlimentoEntity findByAlimento(Long id);

    List<AlimentoEntity> findAllByIngesta(String ingesta, String fechaToma);

    void createAlimento(AlimentoEntity alimento);

    void deleteAlimento(Long id);
}
