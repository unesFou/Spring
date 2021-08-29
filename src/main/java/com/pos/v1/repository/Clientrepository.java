package com.pos.v1.repository;

import com.pos.v1.entities.Client;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Clientrepository extends JpaRepository<Client,Integer> {
    
}
