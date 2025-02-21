package com.sergio.foodRecord.services.AlimentosService;


import com.sergio.foodRecord.dto.AlimentoDTO;
import com.sergio.foodRecord.entities.AlimentoEntity;

import java.util.List;

public interface AlimentoService {
    List<AlimentoEntity> allAlimentos();

    List<AlimentoEntity> findAllByFechaDeTomaBetween(String ingesta);

    void createAlimento(AlimentoDTO alimento);

    void deleteAlimento(Long id);
}
