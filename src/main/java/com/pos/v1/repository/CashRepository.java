package com.pos.v1.repository;

import com.pos.v1.entities.Cash;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CashRepository extends JpaRepository<Cash,Integer> {
    
}
