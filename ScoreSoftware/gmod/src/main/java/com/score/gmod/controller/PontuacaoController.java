package com.score.gmod.controller;

import com.score.gmod.dto.FinalizarPontuacaoRequest;
import com.score.gmod.model.Pontuacao;
import com.score.gmod.service.PontuacaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pontuacoes")
@RequiredArgsConstructor
public class PontuacaoController {

    private final PontuacaoService pontuacaoService;

    @PostMapping
    public Pontuacao criar(@RequestBody Pontuacao pontuacao) {
        return pontuacaoService.criar(pontuacao);
    }

    @GetMapping
    public List<Pontuacao> listar() {
        return pontuacaoService.listar();
    }

    @PutMapping("/finalizar")
    public Pontuacao finalizar(@RequestBody FinalizarPontuacaoRequest request) {
        return pontuacaoService.finalizar(
                request.getJogadorId(),
                request.getPartidaId(),
                request.getScoreFinal(),
                request.getKills(),
                request.getDeaths()
        );
    }
}