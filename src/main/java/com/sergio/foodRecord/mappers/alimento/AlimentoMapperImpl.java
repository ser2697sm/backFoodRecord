package com.sergio.foodRecord.mappers.alimento;
import com.sergio.foodRecord.dto.AlimentoDTO;
import com.sergio.foodRecord.entities.AlimentoEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class AlimentoMapperImpl implements AlimentoMapper {

    //Convertir de AlimentoDTO a AlimentoEntity
    @Override
    public AlimentoEntity toAlimento(AlimentoDTO alimentoDTO) {

        return new AlimentoEntity(
                alimentoDTO.getId(),
                alimentoDTO.getNombreAlimento(),
                alimentoDTO.getIngesta(),
                alimentoDTO.getFechaDeToma()
        );
    }

    @Override
    public AlimentoDTO toAlimentoDTO(AlimentoEntity alimento) {

        return new AlimentoDTO(
                alimento.getIdAlimento(),
                alimento.getNombreAlimento(),
                alimento.getIngesta(),
                alimento.getFechaDeToma()
        );
    }

    @Override
    public List<AlimentoDTO> toAlimentosDtos(List<AlimentoEntity> alimentoEntities) {

        List<AlimentoDTO> listAlimentoDto = new ArrayList<>(alimentoEntities.size());

        for (AlimentoEntity alimento: alimentoEntities) {
            listAlimentoDto.add(toAlimentoDTO(alimento));
        }

        return listAlimentoDto;
    }

    @Override
    public void updateAlimento(AlimentoEntity alimento, AlimentoDTO alimentoDTO) {

        alimento.setIdAlimento(alimentoDTO.getId());
        alimento.setNombreAlimento(alimentoDTO.getNombreAlimento());
        alimento.setIngesta(alimentoDTO.getIngesta());
        alimento.setFechaDeToma(alimentoDTO.getFechaDeToma());
    }
}
