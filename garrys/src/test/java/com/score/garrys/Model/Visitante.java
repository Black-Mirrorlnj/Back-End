package com.score.gmod;

import java.time.LocalDateTime;

class Visitante {

    int idVisitante;
    String nome;
    LocalDateTime horarioEntrada;
    LocalDateTime horarioSaida;
    int kills;

    public String toString() {
        return "Visitante{" +
                "id=" + idVisitante +
                ", nome='" + nome + '\'' +
                ", entrada=" + horarioEntrada +
                ", saida=" + horarioSaida +
                ", kills=" + kills +
                '}';
    }
}
