package com.score.garrys.model;

public class Visitante {

    private int idVisitante;
    private String nome;
    private int nivel;
    private int kills;

    public Visitante() {
    }

    public Visitante(int idVisitante, String nome, int nivel, int kills) {
        this.idVisitante = idVisitante;
        this.nome = nome;
        this.nivel = nivel;
        this.kills = kills;
    }

    public int getIdVisitante() {
        return idVisitante;
    }

    public void setIdVisitante(int idVisitante) {
        this.idVisitante = idVisitante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    @Override
    public String toString() {
        return "Visitante{" +
                "idVisitante=" + idVisitante +
                ", nome='" + nome + '\'' +
                ", nivel=" + nivel +
                ", kills=" + kills +
                '}';
    }
}
