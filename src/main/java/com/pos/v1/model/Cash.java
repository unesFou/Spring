package com.pos.v1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cash")
public class Cash extends paiment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "paiments")
    private boolean paiments;

    public Cash() {
    }

    public Cash(int id, float montant) {
        super(id, montant);
    }

    public boolean isPaiments() {
        return paiments;
    }

    public void setPaiment(boolean paiments) {
        this.paiments = paiments;
    }

    
}
