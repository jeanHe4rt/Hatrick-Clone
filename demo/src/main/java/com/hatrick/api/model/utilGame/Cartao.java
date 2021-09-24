package com.hatrick.api.model.utilGame;

import org.springframework.stereotype.Component;

@Component
public class Cartao {
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
