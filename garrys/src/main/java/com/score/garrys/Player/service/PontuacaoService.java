package com.score.gmod.service;



import com.score.gmod.model.Estatistica;
import com.score.gmod.model.Pontuacao;
import com.score.gmod.model.RankingGlobal;
import com.score.gmod.repository.EstatisticaRepository;
import com.score.gmod.repository.PontuacaoRepository;
import com.score.gmod.repository.RankingGlobalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PontuacaoService {

    private final PontuacaoRepository pontuacaoRepository;
    private final EstatisticaRepository estatisticaRepository;
    private final RankingGlobalRepository rankingGlobalRepository;

    public Pontuacao criar(Pontuacao pontuacao) {
        return pontuacaoRepository.save(pontuacao);
    }

    public List<Pontuacao> listar() {
        return pontuacaoRepository.findAll();
    }

    public List<Pontuacao> listarPorPartida(Long partidaId) {
        return pontuacaoRepository.findByPartidaId(partidaId);
    }

    public Pontuacao finalizarPontuacao(Long jogadorId, Long partidaId, Integer scoreFinal, Integer kills, Integer deaths) {
        Pontuacao pontuacao = pontuacaoRepository.findByJogadorIdAndPartidaId(jogadorId, partidaId)
                .orElseThrow(() -> new RuntimeException("Pontuação não encontrada"));

        pontuacao.setScoreFinal(scoreFinal);
        Pontuacao salva = pontuacaoRepository.save(pontuacao);

        Estatistica estatistica = estatisticaRepository.findByJogadorId(jogadorId)
                .orElseThrow(() -> new RuntimeException("Estatística não encontrada"));

        estatistica.setKills(estatistica.getKills() + kills);
        estatistica.setDeaths(estatistica.getDeaths() + deaths);
        estatistica.setExperiencia(estatistica.getExperiencia() + scoreFinal);
        estatistica.setNivel((estatistica.getExperiencia() / 100) + 1);
        estatisticaRepository.save(estatistica);

        RankingGlobal ranking = rankingGlobalRepository.findById(jogadorId)
                .orElseGet(() -> RankingGlobal.builder()
                        .jogadorId(jogadorId)
                        .pontos(0)
                        .build());

        ranking.setPontos(ranking.getPontos() + scoreFinal);
        rankingGlobalRepository.save(ranking);

        return salva;
    }
}