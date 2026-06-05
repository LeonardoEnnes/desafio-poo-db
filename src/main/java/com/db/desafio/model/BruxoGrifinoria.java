package com.db.desafio.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Grifinoria")
public class BruxoGrifinoria extends Bruxo implements Magia{
    
    protected BruxoGrifinoria() {
        super();
    }

    public BruxoGrifinoria(String nome, String casa) {
        super(nome, casa);
    }

    public void lancarFeitico() {
        System.out.println("Expelliarmus! - O bruxo da Grifinória lançou seu feitiço!");
    }
}
