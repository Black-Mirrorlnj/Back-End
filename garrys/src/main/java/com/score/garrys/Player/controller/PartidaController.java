package com.score.garrys.Player.controller;

import com.score.garrys.Player.dto.CriarPartidaRequest;
import com.score.garrys.Player.model.Partida;
import com.score.garrys.Player.service.PartidaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partidas")
@RequiredArgsConstructor
public class PartidaController {

    private final PartidaService partidaService;

    @PostMapping
    public Partida criar(@RequestBody CriarPartidaRequest request) {
        return partidaService.criar(request.getMapa());
    }

    @GetMapping
    public List<Partida> listar() {
        return partidaService.listar();
    }

    @PutMapping("/{id}/finalizar")
    public Partida finalizar(@PathVariable Long id) {
        return partidaService.finalizar(id);
    }
}