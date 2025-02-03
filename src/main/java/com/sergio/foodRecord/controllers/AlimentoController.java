package com.sergio.foodRecord.controllers;

import com.sergio.foodRecord.entities.AlimentoEntity;
import com.sergio.foodRecord.services.AlimentosService.AlimentoService;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/createAlimento")
    public void crearAlimento(@RequestBody AlimentoEntity alimento) {
       alimentoService.createAlimento(alimento);
    }
}
