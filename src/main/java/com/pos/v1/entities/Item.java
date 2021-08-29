package com.pos.v1.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private float weigth;
    private String manufacturar;
    
    //TODO add this file to constructor and generate getter and setter
    @ManyToOne
    private ShoppingCard card;


    public Item(int id, String name, float weigth, String manufacturar) {
        this.id = id;
        this.name = name;
        this.weigth = weigth;
        this.manufacturar = manufacturar;
    }

    public Item() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeigth() {
        return weigth;
    }

    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }

    public String getManufacturar() {
        return manufacturar;
    }

    public void setManufacturar(String manufacturar) {
        this.manufacturar = manufacturar;
    }
    
    
    

    
}
