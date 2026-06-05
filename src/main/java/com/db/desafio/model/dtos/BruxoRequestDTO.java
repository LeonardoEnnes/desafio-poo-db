package com.db.desafio.model.dtos;

public class BruxoRequestDTO {
    private String nome;
    private String casa;

    public BruxoRequestDTO() {
    }

    public BruxoRequestDTO(String nome, String casa) {
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
}
