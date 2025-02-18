package com.sergio.foodRecord.services.SintomasService;



import com.sergio.foodRecord.entities.SintomasEntity;

import java.time.LocalDate;
import java.util.List;

public interface SintomasService {

    List<SintomasEntity> allSintomas();

    SintomasEntity findBySintomas(Long id);

    List<SintomasEntity> findByFechaSintoma();

    void createSintoma(SintomasEntity sintomas);

    void deleteSintoma(Long id);
}
