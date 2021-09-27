package com.hatrick.api.model;


import java.util.List;

public class Time extends AbstractEntity {


    private  Manager manager;
    private int vitoria;
    private int derrota;
    private int empate;
    private int golsPros;
    private int golSofridos;
    private int cartaoAmarelos;
    private int cartaoVermelho;
    private List<Player> playerList;
    private List<Auxiliar> auxiliarList;

    public Time(Manager manager, List<Player> playerList, List<Auxiliar> auxiliarList) {
        this.manager = manager;
        this.playerList = playerList;
        this.auxiliarList = auxiliarList;
    }

    public Time() {
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public List<Auxiliar> getAuxiliarList() {
        return auxiliarList;
    }

    public void setAuxiliarList(List<Auxiliar> auxiliarList) {
        this.auxiliarList = auxiliarList;
    }
}
