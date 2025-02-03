package com.sergio.foodRecord.services.SintomasService;



import com.sergio.foodRecord.entities.SintomasEntity;

import java.util.List;

public interface SintomasService {

    List<SintomasEntity> allSintomas();

    SintomasEntity findBySintomas(Long id);

    void createSintoma();

    void deleteSintoma(Long id);
}
