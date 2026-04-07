package com.score.gmod.service;

import com.score.gmod.model.RankingGlobal;
import com.score.gmod.repository.RankingGlobalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RankingGlobalService {

    private final RankingGlobalRepository rankingGlobalRepository;

    public List<RankingGlobal> listar() {
        return rankingGlobalRepository.findAllByOrderByPontosDesc();
    }
}