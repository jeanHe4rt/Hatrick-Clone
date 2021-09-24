package com.hatrick.api.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "partida")
public class Partida extends AbstractCharacter{

    @OneToOne
    @JoinColumn(name = "time_1_id")
    private Time time1;
    @OneToOne
    @JoinColumn(name = "time_2_id")
    private Time time2;
    private List<Time> titularesTime1;
    private List<Time> titularesTime2;
    private List<Time> reservasTime1;
    private List<Time> reservasTime2;
//    lista de jogadores Time1 e time 2
//    Subistituição;
//    Lista de Reservas time1 e Time 2


    public Partida(Long id, String type, Time time1, Time time2, List<Time> titularesTime1, List<Time> titularesTime2, List<Time> reservasTime1, List<Time> reservasTime2) {
        super(id, type);
        this.time1 = time1;
        this.time2 = time2;
        this.titularesTime1 = titularesTime1;
        this.titularesTime2 = titularesTime2;
        this.reservasTime1 = reservasTime1;
        this.reservasTime2 = reservasTime2;
    }

    public Time getTime2() {
        return time2;
    }

    public Time getTime1() {
        return time1;
    }

    public List<Time> getTitularesTime1() {
        return titularesTime1;
    }

    public void setTitularesTime1(List<Time> titularesTime1) {
        this.titularesTime1 = titularesTime1;
    }

    public List<Time> getTitularesTime2() {
        return titularesTime2;
    }

    public void setTitularesTime2(List<Time> titularesTime2) {
        this.titularesTime2 = titularesTime2;
    }

    public List<Time> getReservasTime1() {
        return reservasTime1;
    }

    public void setReservasTime1(List<Time> reservasTime1) {
        this.reservasTime1 = reservasTime1;
    }

    public List<Time> getReservasTime2() {
        return reservasTime2;
    }

    public void setReservasTime2(List<Time> reservasTime2) {
        this.reservasTime2 = reservasTime2;
    }


}
