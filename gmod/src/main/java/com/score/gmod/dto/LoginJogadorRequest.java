package com.score.gmod.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginJogadorRequest {
    private String steamId;
    private String nome;
}