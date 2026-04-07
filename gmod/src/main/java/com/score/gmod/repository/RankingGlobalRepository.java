package com.score.gmod.repository;

import com.score.gmod.model.RankingGlobal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RankingGlobalRepository extends JpaRepository<RankingGlobal, Long> {
    List<RankingGlobal> findAllByOrderByPontosDesc();
}