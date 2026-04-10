package com.score.gmod.controller;

import com.score.gmod.dto.VisitanteDTO;
import com.score.gmod.model.Visitante;
import com.score.gmod.service.VisitanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/visitantes")
@RequiredArgsConstructor
public class VisitanteController {

    private final VisitanteService service;

    @PostMapping("/entrada")
    public Map<String, String> entrada(@RequestBody VisitanteDTO dto) {
        service.registrarEntrada(dto.getNome());
        return Map.of("status", "Entrada registrada com sucesso");
    }

    @PutMapping("/saida")
    public Map<String, String> saida(@RequestBody VisitanteDTO dto) {
        service.registrarSaida(dto.getIdVisitante(), dto.getKills());
        return Map.of("status", "Saída registrada com sucesso");
    }

    @DeleteMapping("/{id}")
    public Map<String, String> remover(@PathVariable int id) {
        service.remover(id);
        return Map.of("status", "Visitante removido com sucesso");
    }

    @GetMapping
    public List<Visitante> listar() {
        return service.listar();
    }

    @GetMapping("/ranking")
    public List<Visitante> ranking() {
        return service.rankingKills();
    }
}
