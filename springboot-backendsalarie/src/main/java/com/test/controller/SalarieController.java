package com.test.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.test.execption.ResourceNotFoundException;
import com.test.model.Salarie;
import com.test.repositories.SalarieRepository;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/salaire/els/")
public class SalarieController {
	
	
	
	//retourner toute les salariee
	@Autowired
	SalarieRepository  salarieRepository;
	@GetMapping("/salaires")
	public List<Salarie> getAllSalaires(){
		return salarieRepository.findAll();
	}
	
	
	// create salarie rest api
	@PostMapping("/salaires")
		public Salarie createSalarie(@RequestBody Salarie salarie) {
			return salarieRepository.save(salarie);
		}
	
	//retourner toute les salariee par id
	 @GetMapping("/salaires/{id}")
	    public ResponseEntity<Salarie> getSalarieById(@PathVariable(value = "id") Long salarieId)
	        throws ResourceNotFoundException {
		 Salarie salarie = salarieRepository.findById(salarieId)
	          .orElseThrow(() -> new ResourceNotFoundException("salarie not found for this id :: " + salarieId));
	        return ResponseEntity.ok().body(salarie);
	    }
	 
	 
	 //modification salariee par id
	 @PutMapping("/salaires/{id}")
		public ResponseEntity<Salarie> updateSalarie(@PathVariable Long id, @RequestBody Salarie SalarieDetails){
		 Salarie salarie = salarieRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("salarie not exist with id :" + id));
			
		    salarie.setFonction(SalarieDetails.getFonction());
		    salarie.setAdresse(SalarieDetails.getAdresse());
		    salarie.setAnnee_experience(SalarieDetails.getAnnee_experience());
		    salarie.setDate_de_naissance(SalarieDetails.getDate_de_naissance());
		    salarie.setPrenom(SalarieDetails.getPrenom());
		    salarie.setSalaire(SalarieDetails.getSalaire());
			
			
		    Salarie updatedSalarie = salarieRepository.save(salarie);
			return ResponseEntity.ok(updatedSalarie);
		}
	 
	// delete salariee rest api
		@DeleteMapping("/salaires/{id}")
		public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){
			Salarie salarie = salarieRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("salarie not exist with id :" + id));
			
			salarieRepository.delete(salarie);
			Map<String, Boolean> response = new HashMap<>();
			response.put("deleted", Boolean.TRUE);
			return ResponseEntity.ok(response);
		}
}
