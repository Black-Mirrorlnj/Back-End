package com.score.gmod.repository;

import com.score.gmod.model.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JogadorRepository extends JpaRepository<Jogador, Long> {
    Optional<Jogador> findBySteamId(String steamId);
}