package com.test.controller;


import com.test.execption.ResourceNotFoundException;
import com.test.model.Client;
import com.test.model.Salarie;
import com.test.repositories.ClientRepository;
import com.test.repositories.SalarieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
/*appel front*/
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/client/els/")
public class ClientController {

    @Autowired
    ClientRepository clientRepository;

    /*liste tous les clients*/
    @GetMapping("/listeClient")
    public List<Client> getAllClients(){
        return clientRepository.findAll();
    }


    /*liste tous les clients par un id*/
    @GetMapping("/listeClient/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable Integer id) {
        Client client = clientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Client not exist with id :" + id));
        return ResponseEntity.ok(client);
    }


    /*suppresion d'un client*/
    @DeleteMapping("/listeClient/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteClient(@PathVariable Integer id){
        Client client = clientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("client not exist with id :" + id));
        clientRepository.delete(client);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }


    /*ajouter un client*/
    @PostMapping("/cl")
    public Client createEmployee(@RequestBody Client clients) {
        return clientRepository.save(clients);
    }


    /*mise a jour (update)*/
    @PutMapping("/listeClient/{id}")
    public ResponseEntity<Client> updateClient(@PathVariable Integer id, @RequestBody Client clientDetails){
        Client clients= clientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("client not exist with id :" + id));
        clients.setEmail(clientDetails.getEmail());
        clients.setNationalite(clientDetails.getNationalite());
        clients.setNom(clientDetails.getNom());
        Client updateClient = clientRepository.save(clients);
        return ResponseEntity.ok(updateClient);
    }

}
