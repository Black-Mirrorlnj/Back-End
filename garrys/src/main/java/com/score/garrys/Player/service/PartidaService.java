package com.score.gmod.service;



import com.score.gmod.model.Partida;
import com.score.gmod.repository.PartidaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PartidaService {

    private final PartidaRepository partidaRepository;

    public Partida criar(String mapa) {
        Partida partida = Partida.builder()
                .mapa(mapa)
                .dataInicio(LocalDateTime.now())
                .build();

        return partidaRepository.save(partida);
    }

    public List<Partida> listar() {
        return partidaRepository.findAll();
    }

    public Partida buscarPorId(Long id) {
        return partidaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Partida não encontrada"));
    }

    public Partida finalizar(Long id) {
        Partida partida = buscarPorId(id);
        partida.setDataFim(LocalDateTime.now());
        return partidaRepository.save(partida);
    }
}