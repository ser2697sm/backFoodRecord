package com.sergio.foodRecord.services.SintomasService;

import com.sergio.foodRecord.entities.SintomasEntity;
import com.sergio.foodRecord.repositories.SintomasRepository;
import org.springframework.stereotype.Service;

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
    public void createSintoma() {

    }

    @Override
    public void deleteSintoma(Long id) {

    }
}
