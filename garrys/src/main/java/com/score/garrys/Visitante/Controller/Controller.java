package com.score.gmod.controller;

import com.score.gmod.dto.VisitanteDTO;
import com.score.gmod.model.Visitante;
import com.score.gmod.service.VisitanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visitantes")
@RequiredArgsConstructor
public class VisitanteController {

    private final VisitanteService visitanteService;

    // 🔹 Registrar entrada
    @PostMapping("/entrada")
    public Visitante registrarEntrada(@RequestBody VisitanteDTO dto) {
        return visitanteService.registrarEntrada(dto.getNome());
    }

    // 🔹 Registrar saída
    @PutMapping("/saida")
    public Visitante registrarSaida(@RequestBody VisitanteDTO dto) {
        return visitanteService.registrarSaida(dto.getIdVisitante(), dto.getKills());
    }

    // 🔹 Listar todos
    @GetMapping
    public List<Visitante> listar() {
        return visitanteService.listar();
    }

    // 🔹 Ranking de kills
    @GetMapping("/ranking")
    public List<Visitante> ranking() {
        return visitanteService.rankingKills();
    }

    // 🔹 Health check (extra)
    @GetMapping("/health")
    public String healthCheck() {
        return "API Visitante OK";
    }
}
