package com.hatrick.api.model;

import com.hatrick.api.model.utilGame.Cartao;
import com.hatrick.api.model.utilGame.Contusao;
import com.hatrick.api.model.utilGame.Habilidade;



public class Player extends AbstractCharacter {

    private String name;
    private int age;
    private int tsi;
    private String nacionalidade;
    private double salario;
    private int forma;
    private int resistencia;
    private String [] personalidade;
    private String especialidade;
    private Contusao contusao;
    private Cartao cartao;
    private Habilidade habilidade;
    private String posicao;


    public Player(Long id, String type, String name, int age, int tsi,
                  String nacionalidade, double salario, int forma, int resistencia,
                  String[] personalidade, String especialidade, String posicao
    ) {
        super(id, type);
        this.name = name;
        this.age = age;
        this.tsi = tsi;
        this.nacionalidade = nacionalidade;
        this.salario = salario;
        this.forma = forma;
        this.resistencia = resistencia;
        this.personalidade = personalidade;
        this.especialidade = especialidade;
        this.contusao = new Contusao(0,null);
        this.cartao =  new Cartao(0,0);
        this.habilidade = new Habilidade();
        this.posicao = posicao;
    }

    public Player(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTsi() {
        return tsi;
    }

    public void setTsi(int tsi) {
        this.tsi = tsi;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getForma() {
        return forma;
    }

    public void setForma(int forma) {
        this.forma = forma;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public String[] getPersonalidade() {
        return personalidade;
    }

    public void setPersonalidade(String[] personalidade) {
        this.personalidade = personalidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public Habilidade getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(Habilidade habilidade) {
        this.habilidade = habilidade;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
}
