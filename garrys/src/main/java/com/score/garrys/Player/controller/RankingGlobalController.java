package com.score.garrys.Player.controller;

import com.score.garrys.Player.model.RankingGlobal;
import com.score.garrys.Player.service.RankingGlobalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ranking")
@RequiredArgsConstructor
public class RankingGlobalController {

    private final RankingGlobalService rankingGlobalService;

    @GetMapping
    public List<RankingGlobal> listar() {
        return rankingGlobalService.listar();
    }
}