package com.score.gmod.repository;

import com.score.gmod.model.Pontuacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PontuacaoRepository extends JpaRepository<Pontuacao, Long> {
    List<Pontuacao> findByPartidaId(Long partidaId);
    Optional<Pontuacao> findByJogadorIdAndPartidaId(Long jogadorId, Long partidaId);
}