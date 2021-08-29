package com.pos.v1.repository;

import com.pos.v1.entities.Item;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Integer> {
    
}
