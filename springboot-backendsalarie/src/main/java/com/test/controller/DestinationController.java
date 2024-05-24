package com.test.controller;


import com.test.execption.ResourceNotFoundException;
import com.test.model.Client;
import com.test.model.Destination;
import com.test.repositories.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/destination/v1/")
public class DestinationController {



    @Autowired
    DestinationRepository destinationRepository;

    /*lister tous les destination*/
    @GetMapping("/listedestination")
    public List<Destination> getAllDestinations(){
        return destinationRepository.findAll();
    }


    /*lister les destinations par id */
    @GetMapping("/listedestination/{id}")
    public ResponseEntity<Destination> getDestinationById(@PathVariable Integer id) {
        Destination destination = destinationRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("ba3 :" + id));
        return ResponseEntity.ok(destination);
    }

    /*suppression d'une destination*/
    @DeleteMapping("/listedestination/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteDestination(@PathVariable int id){
        Destination destination = destinationRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("destination not exist with id :" + id));
        destinationRepository.delete(destination);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }


    @PostMapping("/ajouter/destination")
    public Destination createDestination(@RequestBody Destination destinations) {
        return destinationRepository.save(destinations);
    }
}

