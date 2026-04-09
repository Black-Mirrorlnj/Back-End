package com.score.garrys.Player.controller;


import com.score.garrys.Player.dto.LoginJogadorRequest;
import com.score.garrys.Player.model.Jogador;
import com.score.garrys.Player.service.JogadorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogadores")
@RequiredArgsConstructor
public class JogadorController {

    private final JogadorService jogadorService;

    @PostMapping
    public Jogador criar(@RequestBody Jogador jogador) {
        return jogadorService.criar(jogador);
    }

    @PostMapping("/login")
    public Jogador login(@RequestBody LoginJogadorRequest request) {
        return jogadorService.loginPorSteamId(request.getSteamId(), request.getNome());
    }

    @GetMapping
    public List<Jogador> listar() {
        return jogadorService.listar();
    }

    @GetMapping("/{id}")
    public Jogador buscarPorId(@PathVariable Long id) {
        return jogadorService.buscarPorId(id);
    }
}