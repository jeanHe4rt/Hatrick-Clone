package com.hatrick.api.model.utilGame;

import org.springframework.stereotype.Component;

import javax.persistence.Table;



public class Habilidade {
    private String typePlayer;
    private int armacao;
    private int finalizacao;
    private int ala;
    private int goleiro;
    private int assistencia;
    private int defesa;
    private int bolaParada;

    public Habilidade() {
    }

    public Habilidade(String typePlayer, int armacao, int finalizacao,
                      int ala, int goleiro, int assistencia, int defesa,
                      int bolaParada) {
        this.typePlayer = typePlayer;
        this.armacao = armacao;
        this.finalizacao = finalizacao;
        this.ala = ala;
        this.goleiro = goleiro;
        this.assistencia = assistencia;
        this.defesa = defesa;
        this.bolaParada = bolaParada;
    }

    public String getTypePlayer() {
        return typePlayer;
    }

    public void setTypePlayer(String typePlayer) {
        this.typePlayer = typePlayer;
    }

    public int getArmacao() {
        return armacao;
    }

    public void setArmacao(int armacao) {
        this.armacao = armacao;
    }

    public int getFinalizacao() {
        return finalizacao;
    }

    public void setFinalizacao(int finalizacao) {
        this.finalizacao = finalizacao;
    }

    public int getAla() {
        return ala;
    }

    public void setAla(int ala) {
        this.ala = ala;
    }

    public int getGoleiro() {
        return goleiro;
    }

    public void setGoleiro(int goleiro) {
        this.goleiro = goleiro;
    }

    public int getAssistencia() {
        return assistencia;
    }

    public void setAssistencia(int assistencia) {
        this.assistencia = assistencia;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getBolaParada() {
        return bolaParada;
    }

    public void setBolaParada(int bolaParada) {
        this.bolaParada = bolaParada;
    }
}
