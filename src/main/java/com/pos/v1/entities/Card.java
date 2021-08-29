package com.pos.v1.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "card")
public class Card extends paiment {

    // @Id
    // @GeneratedValue
    // private int id;
    @Column(name = "name_card")
    private String name;

    @Column(name = "card_number")
    private String card_number;

    public Card() {
    }

    public Card(int id, float montant) {
        super(id, montant);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

         

}
