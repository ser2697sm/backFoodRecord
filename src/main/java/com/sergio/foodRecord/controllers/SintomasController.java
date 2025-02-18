package com.sergio.foodRecord.controllers;

import com.sergio.foodRecord.entities.SintomasEntity;
import com.sergio.foodRecord.services.SintomasService.SintomasService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/sintomas")
public class SintomasController {

    private final SintomasService sintomasService;

    public SintomasController(SintomasService sintomasService) {
        this.sintomasService = sintomasService;
    }

    @GetMapping("/allSintomas")
    public ResponseEntity<?> allSintomas() {
        return ResponseEntity.ok(sintomasService.allSintomas());
    }

    @GetMapping("/findByFechaSintoma")
    public ResponseEntity<?> findByFechaSintoma () {
        return ResponseEntity.ok(sintomasService.findByFechaSintoma());
    }


    @PostMapping("/createSintomas")
    public void crearSintoma(@RequestBody SintomasEntity sintomas) {
        sintomasService.createSintoma(sintomas);
    }
}
