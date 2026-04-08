package com.score.gmod.service;



import com.score.gmod.model.Estatistica;
import com.score.gmod.repository.EstatisticaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EstatisticaService {

    private final EstatisticaRepository estatisticaRepository;

    public List<Estatistica> listar() {
        return estatisticaRepository.findAll();
    }

    public Estatistica buscarPorJogadorId(Long jogadorId) {
        return estatisticaRepository.findByJogadorId(jogadorId)
                .orElseThrow(() -> new RuntimeException("Estatísticas não encontradas"));
    }

    public Estatistica atualizar(Long jogadorId, Estatistica dados) {
        Estatistica estatistica = buscarPorJogadorId(jogadorId);

        estatistica.setKills(dados.getKills());
        estatistica.setDeaths(dados.getDeaths());
        estatistica.setDinheiro(dados.getDinheiro());
        estatistica.setNivel(dados.getNivel());
        estatistica.setExperiencia(dados.getExperiencia());

        return estatisticaRepository.save(estatistica);
    }
}