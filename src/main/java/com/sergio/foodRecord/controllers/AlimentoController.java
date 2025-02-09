package com.sergio.foodRecord.controllers;

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

    @GetMapping("/findByIngesta")
    public ResponseEntity<?> findByIngesta(@RequestParam String ingesta, @RequestParam String fechaToma) {
        return ResponseEntity.ok(alimentoService.findAllByIngesta(ingesta,fechaToma));
    }

    @PostMapping("/createAlimento")
    public void crearAlimento(@RequestBody AlimentoEntity alimento) {
       alimentoService.createAlimento(alimento);
    }
}
