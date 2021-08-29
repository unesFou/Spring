package com.pos.v1.service;

import com.pos.v1.entities.Client;
import com.pos.v1.repository.Clientrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    
    @Autowired
    private Clientrepository clientrepository;

    public Client saveClientService(Client c){
        return clientrepository.save(c);
    }
}
