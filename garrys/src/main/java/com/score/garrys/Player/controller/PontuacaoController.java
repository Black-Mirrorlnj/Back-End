package com.score.garrys.Player.controller;



import com.score.garrys.Player.dto.FinalizarPontuacaoRequest;
import com.score.garrys.Player.model.Pontuacao;
import com.score.garrys.Player.service.PontuacaoService;
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

    @GetMapping("/partida/{partidaId}")
    public List<Pontuacao> listarPorPartida(@PathVariable Long partidaId) {
        return pontuacaoService.listarPorPartida(partidaId);
    }

    @PutMapping("/finalizar")
    public Pontuacao finalizar(@RequestBody FinalizarPontuacaoRequest request) {
        return pontuacaoService.finalizarPontuacao(
                request.getJogadorId(),
                request.getPartidaId(),
                request.getScoreFinal(),
                request.getKills(),
                request.getDeaths()
        );
    }
}