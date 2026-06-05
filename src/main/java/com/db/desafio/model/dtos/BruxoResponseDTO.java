package com.db.desafio.model.dtos;

public class BruxoResponseDTO {
    private String nome;
    private String casa;
    private String tipoMagia;

    public BruxoResponseDTO() {
    }

    public BruxoResponseDTO(String nome, String casa, String tipoMagia) {
        this.nome = nome;
        this.casa = casa;
        this.tipoMagia = tipoMagia;
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

    public String getTipoMagia() {
        return tipoMagia;
    }

    public void setTipoMagia(String tipoMagia) {
        this.tipoMagia = tipoMagia;
    }
}
