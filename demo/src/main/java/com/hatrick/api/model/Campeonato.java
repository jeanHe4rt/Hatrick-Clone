package com.hatrick.api.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "campeonato")
public class Campeonato extends AbstractEntity{

    private String name;
    private List<Time> timeList;

    public Campeonato(){
    }
//Time CAMPEÃO
// Classificação
// Terminar de codar Classe;

}
