package com.sergio.foodRecord.services.AlimentosService;


import com.sergio.foodRecord.dto.AlimentoDTO;
import com.sergio.foodRecord.entities.AlimentoEntity;

import java.time.LocalDate;
import java.util.List;

public interface AlimentoService {
    List<AlimentoEntity> allAlimentos();

    AlimentoEntity findByAlimento(Long id);

    List<AlimentoDTO> findByFechaToma(String ingesta);

    void createAlimento(AlimentoDTO alimento);

    void deleteAlimento(Long id);
}
