package com.sergio.foodRecord.services.SintomasService;

import com.sergio.foodRecord.entities.SintomasEntity;
import com.sergio.foodRecord.repositories.SintomasRepository;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.List;

@Service
public class SintomasServiceImpl implements SintomasService{

    private final SintomasRepository sintomasRepository;

    public SintomasServiceImpl(SintomasRepository sintomasRepository) {
        this.sintomasRepository = sintomasRepository;
    }

    @Override
    public List<SintomasEntity> allSintomas() {
        return sintomasRepository.findAll();
    }

    @Override
    public SintomasEntity findBySintomas(Long id) {
        return null;
    }

    @Override
    public List<SintomasEntity> findByFechaSintoma() {

        LocalDate hoy = LocalDate.now();
        DayOfWeek primerDiaSemana = DayOfWeek.MONDAY; // Puedes cambiarlo según configuración regional
        LocalDate inicioSemana = hoy.with(TemporalAdjusters.previousOrSame(primerDiaSemana));
        LocalDate finSemana = inicioSemana.plusDays(6);

        return sintomasRepository.findByFechaSintoma(inicioSemana,finSemana);
    }

    @Override
    public void createSintoma(SintomasEntity sintomas) {

        if(sintomas.getFechaSintoma() == null) {
            sintomas.setFechaSintoma(LocalDate.now());
        }

        sintomasRepository.save(sintomas);
    }

    @Override
    public void deleteSintoma(Long id) {

    }
}
