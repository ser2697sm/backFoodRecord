package com.sergio.foodRecord.controllers;

import com.sergio.foodRecord.dto.AlimentoDTO;
import com.sergio.foodRecord.entities.AlimentoEntity;
import com.sergio.foodRecord.services.AlimentosService.AlimentoService;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/alimento")
public class AlimentoController {

    private final AlimentoService alimentoService;

    public AlimentoController(AlimentoService alimentoService) {
        this.alimentoService = alimentoService;
    }

    @GetMapping("/allAlimentos")
    public ResponseEntity<?> allAlimento() {
        return ResponseEntity.ok(alimentoService.allAlimentos());
    }

    @GetMapping("/findByIngesta/{ingesta}")
    public ResponseEntity<?> findByIngesta(@PathVariable String ingesta) {
        return ResponseEntity.ok(alimentoService.findByFechaToma(ingesta));
    }

    @PostMapping("/createAlimento")
    public void crearAlimento(@RequestBody AlimentoDTO alimento) {
       alimentoService.createAlimento(alimento);
    }
}
