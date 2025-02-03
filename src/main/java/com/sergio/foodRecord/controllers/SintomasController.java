package com.sergio.foodRecord.controllers;

import com.sergio.foodRecord.services.SintomasService.SintomasService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
