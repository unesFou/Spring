package com.pos.v1.controler;

import java.util.List;

import com.pos.v1.entities.Client;
import com.pos.v1.service.ClientService;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class ClientControler {

private final ClientService clientService;

 public ClientControler(ClientService clientService) {
     this.clientService = clientService;
 }

 // Get All client
 @GetMapping("/clients")
List<Client> all() {
    return clientService.sellectAllClient();
  }
}
