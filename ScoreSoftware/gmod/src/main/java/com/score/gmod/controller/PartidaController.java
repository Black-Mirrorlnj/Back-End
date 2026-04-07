package com.score.gmod.controller;

import com.score.gmod.dto.CriarPartidaRequest;
import com.score.gmod.model.Partida;
import com.score.gmod.service.PartidaService;
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

    @PutMapping("/{id}/finalizar")
    public Partida finalizar(@PathVariable Long id) {
        return partidaService.finalizar(id);
    }

    @GetMapping
    public List<Partida> listar() {
        return partidaService.listar();
    }
}