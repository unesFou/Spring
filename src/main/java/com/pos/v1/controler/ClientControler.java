package com.pos.v1.controler;

import java.util.List;

import com.pos.v1.entities.Client;
import com.pos.v1.repository.Clientrepository;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class ClientControler {

private final Clientrepository clientrepository;

public ClientControler(Clientrepository clientrepository) {
    this.clientrepository = clientrepository;
}

 // Get All client
@GetMapping("/clients")
List<Client> all() {
   return clientrepository.findAll();
 }


  
    

}
