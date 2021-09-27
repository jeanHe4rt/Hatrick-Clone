package com.hatrick.api.model;

import com.hatrick.api.util.DateUtil;


public class Auxiliar extends AbstractCharacter {

    private String name;
    private DateUtil inicioContrato;
    private DateUtil fimContrato;
    private int tempoContrato;
    private double salario;


    public Auxiliar(Long id, String type, String name, DateUtil inicioContrato,
                    DateUtil fimContrato, int tempoContrato, double salario) {
        super(id, type);
        this.name = name;
        this.inicioContrato = inicioContrato;
        this.fimContrato = fimContrato;
        this.tempoContrato = tempoContrato;
        this.salario = salario;
    }

    public Auxiliar() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DateUtil getInicioContrato() {
        return inicioContrato;
    }

    public void setInicioContrato(DateUtil inicioContrato) {
        this.inicioContrato = inicioContrato;
    }

    public DateUtil getFimContrato() {
        return fimContrato;
    }

    public void setFimContrato(DateUtil fimContrato) {
        this.fimContrato = fimContrato;
    }

    public int getTempoContrato() {
        return tempoContrato;
    }

    public void setTempoContrato(int tempoContrato) {
        this.tempoContrato = tempoContrato;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
