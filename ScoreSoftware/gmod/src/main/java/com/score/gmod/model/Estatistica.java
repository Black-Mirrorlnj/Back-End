package com.score.gmod.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "estatisticas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Estatistica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "jogador_id", nullable = false)
    private Long jogadorId;

    @Column(nullable = false)
    private Integer kills;

    @Column(nullable = false)
    private Integer deaths;

    @Column(nullable = false)
    private Integer dinheiro;

    @Column(nullable = false)
    private Integer nivel;

    @Column(nullable = false)
    private Integer experiencia;
}