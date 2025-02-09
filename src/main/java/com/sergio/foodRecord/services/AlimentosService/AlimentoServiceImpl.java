package com.sergio.foodRecord.services.AlimentosService;

import com.sergio.foodRecord.entities.AlimentoEntity;
import com.sergio.foodRecord.repositories.AlimentoRepository;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
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
    public List<AlimentoEntity> findAllByIngesta(String ingesta,String fechaToma) {

        try {
            // Usar DateTimeFormatter para analizar la cadena fechaToma
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate fechaFormateada = LocalDate.parse(fechaToma, formatter);

            // Llamar al método del repositorio con los parámetros correctos
            return alimentoRepository.findAllByIngestaAndFechaDeToma(ingesta, fechaFormateada);
        } catch (DateTimeParseException e) {
            // Manejar la excepción si el formato de fecha no es correcto
            throw new IllegalArgumentException("Formato de fecha incorrecto: " + fechaToma, e);
        }
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
