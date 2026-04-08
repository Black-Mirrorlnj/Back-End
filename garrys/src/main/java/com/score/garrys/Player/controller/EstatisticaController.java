package com.score.gmod.controller;

import com.score.gmod.model.Estatistica;
import com.score.gmod.service.EstatisticaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estatisticas")
@RequiredArgsConstructor
public class EstatisticaController {

    private final EstatisticaService estatisticaService;

    @GetMapping
    public List<Estatistica> listar() {
        return estatisticaService.listar();
    }

    @GetMapping("/jogador/{jogadorId}")
    public Estatistica buscarPorJogadorId(@PathVariable Long jogadorId) {
        return estatisticaService.buscarPorJogadorId(jogadorId);
    }

    @PutMapping("/jogador/{jogadorId}")
    public Estatistica atualizar(@PathVariable Long jogadorId, @RequestBody Estatistica estatistica) {
        return estatisticaService.atualizar(jogadorId, estatistica);
    }
}