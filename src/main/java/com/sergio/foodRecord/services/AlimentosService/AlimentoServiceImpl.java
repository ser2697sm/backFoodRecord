package com.sergio.foodRecord.services.AlimentosService;

import com.sergio.foodRecord.dto.AlimentoDTO;
import com.sergio.foodRecord.entities.AlimentoEntity;
import com.sergio.foodRecord.mappers.alimento.AlimentoMapper;
import com.sergio.foodRecord.repositories.AlimentoRepository;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.List;

@Service
public class AlimentoServiceImpl implements AlimentoService{

    private final AlimentoRepository alimentoRepository;
    private final AlimentoMapper alimentoMapper;


    public AlimentoServiceImpl(AlimentoRepository alimentoRepository, AlimentoMapper alimentoMapper) {
        this.alimentoRepository = alimentoRepository;
        this.alimentoMapper = alimentoMapper;
    }

    @Override
    public List<AlimentoEntity> allAlimentos() {
        return alimentoRepository.findAll();
    }

    @Override
    public List<AlimentoEntity> findAllByFechaDeTomaBetween(String ingesta) {

        LocalDate hoy = LocalDate.now();
        DayOfWeek primerDiaSemana = DayOfWeek.MONDAY; // Puedes cambiarlo según configuración regional
        LocalDate inicioSemana = hoy.with(TemporalAdjusters.previousOrSame(primerDiaSemana));
        LocalDate finSemana = inicioSemana.plusDays(6);
        // Llamar al método del repositorio con los parámetros correctos
        return alimentoRepository.findAllByFechaDeTomaBetween(inicioSemana,finSemana,ingesta);

    }


    @Override
    public void createAlimento(AlimentoDTO alimento) {

        if(alimento.getFechaDeToma() == null) {
            alimento.setFechaDeToma(LocalDate.now());
        }

        alimentoRepository.save(alimentoMapper.toAlimento(alimento));
    }

    @Override
    public void deleteAlimento(Long id) {

    }
}
