package com.db.desafio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy =  InheritanceType.SINGLE_TABLE)
public class Bruxo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String casa;

    protected Bruxo () {
    }

    public Bruxo(String nome, String casa) {
        this.nome = nome;
        this.casa = casa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public void mostrarInformacoes() {
        System.out.println("Bruxo: " + this.nome + ", Casa :" + this.casa);
    }

}
