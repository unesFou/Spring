package com.pos.v1.entities;

import java.util.List;

//import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "shoppingCard")
public class ShoppingCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
   
    @OneToMany(mappedBy = "card")
    private List<Item> item;
   
    public ShoppingCard() {
    }

    public ShoppingCard(int id, List<Item> item) {
        this.id = id;
        this.item = item;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }
    
    
    
    
}
