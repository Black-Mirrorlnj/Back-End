package com.score.gmod.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CriarPontuacaoRequest {
    private Long jogadorId;
    private Long partidaId;
    private Integer scoreInicial;
    private Integer scoreFinal;
}