package com.score.gmod.controller;

import com.score.gmod.dto.LoginJogadorRequest;
import com.score.gmod.model.Jogador;
import com.score.gmod.service.JogadorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogadores")
@RequiredArgsConstructor
public class JogadorController {

    private final JogadorService jogadorService;

    @PostMapping("/login")
    public Jogador login(@RequestBody LoginJogadorRequest request) {
        return jogadorService.login(request.getSteamId(), request.getNome());
    }

    @GetMapping
    public List<Jogador> listar() {
        return jogadorService.listar();
    }
}