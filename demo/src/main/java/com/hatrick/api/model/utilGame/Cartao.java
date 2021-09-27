package com.hatrick.api.model.utilGame;

import com.hatrick.api.model.Player;

public class Cartao {
    private Player player;
    private int yellow;
    private int red;

    public Cartao(int yellow, int red) {
        this.yellow = yellow;
        this.red = red;
    }

    public Cartao() {
    }

    public int getYellow() {
        return yellow;
    }

    public void setYellow(int yellow) {
        this.yellow = yellow;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }
}
