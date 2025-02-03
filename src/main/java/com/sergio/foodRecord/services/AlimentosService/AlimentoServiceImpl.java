package com.sergio.foodRecord.services.AlimentosService;

import com.sergio.foodRecord.entities.AlimentoEntity;
import com.sergio.foodRecord.repositories.AlimentoRepository;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@Service
public class AlimentoServiceImpl implements AlimentoService{

    private final AlimentoRepository alimentoRepository;

    public AlimentoServiceImpl(AlimentoRepository alimentoRepository) {
        this.alimentoRepository = alimentoRepository;
    }

    @Override
    public List<AlimentoEntity> allAlimentos() {
        return alimentoRepository.findAll();
    }

    @Override
    public AlimentoEntity findByAlimento(Long id) {
        return null;
    }

    @Override
    public void createAlimento(AlimentoEntity alimento) {



        if(alimento.getFechaDeToma() == null) {
            alimento.setFechaDeToma(LocalDate.now());
        }
        alimentoRepository.save(alimento);
    }

    @Override
    public void deleteAlimento(Long id) {

    }
}
