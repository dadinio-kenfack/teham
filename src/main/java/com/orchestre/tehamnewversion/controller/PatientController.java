package com.orchestre.tehamnewversion.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orchestre.tehamnewversion.model.Patient;
import com.orchestre.tehamnewversion.repository.PatientRepository;

@RestController
@RequestMapping("/api/v1/")
public class PatientController {
	
	@Autowired
	PatientRepository repository;
	
	public PatientController(PatientRepository repository) {
		this.repository = repository;
	}
	
	//@CrossOrigin(origins= "http://localhost:4200")
	@GetMapping("/patients")
	ResponseEntity<List<Patient>> allPerson(){
		List<Patient> poeple = new ArrayList<>();
		Iterable<Patient> iterable = repository.findAll();
		iterable.forEach(p -> {
			poeple.add(p);
		});
	return new ResponseEntity<List<Patient>>(poeple, HttpStatus.OK);
	}
	
	//@CrossOrigin(origins= "http://localhost:4200")
	@GetMapping("/patient/{id}")
	ResponseEntity<Patient> onePerson(@PathVariable Long id){
		Optional<Patient> request = repository.findById(id);
		if(!request.isPresent())
			return new ResponseEntity<Patient>(new Patient(), HttpStatus.BAD_REQUEST);
		return new ResponseEntity<Patient>(request.get(), HttpStatus.OK);	
	}
	
	
	//@CrossOrigin(origins= "http://localhost:4200")
	@PostMapping("/patients")
	ResponseEntity<Patient> newPerson(@RequestBody Patient p){
		Patient person = repository.save(p);
		return new ResponseEntity<Patient>((person ), HttpStatus.OK);
	}
	
	
	//@CrossOrigin(origins= "http://localhost:4200")
	@DeleteMapping("/patient/{id}")
	ResponseEntity<Patient> deletePerson(@PathVariable Long id){
		Optional<Patient> request = repository.findById(id);
		if(!request.isPresent())
			return new ResponseEntity<Patient>(new Patient(), HttpStatus.BAD_REQUEST);
		repository.delete(request.get());
		return new ResponseEntity<Patient>(new Patient(), HttpStatus.OK);
	}
	
	

	
}
