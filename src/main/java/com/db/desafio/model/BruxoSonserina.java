package com.db.desafio.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Sonserina")
public class BruxoSonserina extends Bruxo implements Magia{

    public BruxoSonserina() {
        super();
    }

    public BruxoSonserina(String nome, String casa) {
        super(nome, casa);
    }

    @Override 
    public void lancarFeitico() {
        System.out.println("Serpensortia! - O bruxo da Sonserina lançou seu feitiço!");
    }
}
