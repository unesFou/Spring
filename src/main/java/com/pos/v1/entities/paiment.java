package com.pos.v1.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "paiment")
public class paiment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "montant")
    private float montant;

    
    public paiment() {
    }


    public paiment(int id, float montant) {
        this.id = id;
        this.montant = montant;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public float getMantant() {
        return montant;
    }


    public void setMantant(float montant) {
        this.montant = montant;
    }

    

}
