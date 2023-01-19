package com.test.controller;


import com.test.model.Client;
import com.test.model.Salarie;
import com.test.repositories.ClientRepository;
import com.test.repositories.SalarieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/client/els/")
public class ClientController {


    @Autowired
    ClientRepository clientRepository;
    @GetMapping("/client")
    public List<Client> getAllClients(){
        return clientRepository.findAll();
    }
}
