package com.pos.v1.repository;

import com.pos.v1.entities.Card;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card,Integer>{
    
    
}
