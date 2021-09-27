package com.hatrick.api.model.utilGame;

import com.hatrick.api.util.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.persistence.Table;


public class Contusao {
    private double tempoMachudado;
    private DateUtil dataDoMachucado;

    public Contusao(double tempoMachudado, DateUtil dataDoMachucado) {
        this.tempoMachudado = tempoMachudado;
        this.dataDoMachucado = dataDoMachucado;
    }

    public Contusao() {
    }

    public Contusao(double tempoMachudado) {
        this.tempoMachudado = tempoMachudado;
    }

    public double getTempoMachudado() {
        return tempoMachudado;
    }

    public void setTempoMachudado(double tempoMachudado) {
        this.tempoMachudado = tempoMachudado;
    }
}
