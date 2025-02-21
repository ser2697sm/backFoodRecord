package com.sergio.foodRecord.mappers.alimento;

import com.sergio.foodRecord.dto.AlimentoDTO;
import com.sergio.foodRecord.entities.AlimentoEntity;

import java.util.List;

public interface AlimentoMapper {

    AlimentoEntity toAlimento(AlimentoDTO alimentoDTO);

    AlimentoDTO toAlimentoDTO(AlimentoEntity alimento);



    List<AlimentoDTO> toAlimentosDtos(List<AlimentoEntity> alimentoEntities);

    void updateAlimento(AlimentoEntity alimento,AlimentoDTO alimentoDTO);

}
