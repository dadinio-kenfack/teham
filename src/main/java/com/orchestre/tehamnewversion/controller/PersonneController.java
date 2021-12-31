package com.orchestre.tehamnewversion.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/")
public class PersonneController {
	
	/*@Autowired
	PersonneRepository repository;
	
	public PersonneController(PersonneRepository repository) {
		this.repository = repository;
	}*/
	
	/*	@GetMapping("/personnes")
	 	ResponseEntity<List<Personne>> allPersonne(){
		List<Personne> personne = new ArrayList<>();
		Iterable<Personne> iterable = repository.findAll();
		iterable.forEach(a -> {
			personne.add(a);
		});
	return new ResponseEntity<List<Personne>>(personne, HttpStatus.OK);
	}*/
	
	
	
	/*@GetMapping("/personne/{id}")
	ResponseEntity<Personne> onePersonne(@PathVariable Long id){
		Optional<Personne> request = repository.findById(id);
		if(!request.isPresent())
			return new ResponseEntity<Personne>(new Personne(), HttpStatus.BAD_REQUEST);
		return new ResponseEntity<Personne>(request.get(), HttpStatus.OK);	
	}*/
	
	/*
	@PostMapping("/personne")
	ResponseEntity<Personne> newPersonne(@RequestBody Personne p){
		Personne person = repository.save(p);
		return new ResponseEntity<Personne>(person, HttpStatus.OK);
	}*/
	
	/*
	@PutMapping("/personne/{id}")
	ResponseEntity<Personne> updatePersonne(@PathVariable Long id, @RequestBody Personne p){
		Optional<Personne> request = repository.findById(id);
		if(!request.isPresent())
			return new ResponseEntity<Personne>(new Personne(), HttpStatus.BAD_REQUEST);
		Personne person = request.get();
		person.setNom_rue(p.getNom_rue());
		repository.save(person);
		return new ResponseEntity<Personne>(person, HttpStatus.OK);
	}*/
	
	/*
	@DeleteMapping("/personne/{id}")
	ResponseEntity<Personne> deletePersonne(@PathVariable Long id){
		Optional<Personne> request = repository.findById(id);
		if(!request.isPresent())
			return new ResponseEntity<Personne>(new Personne(), HttpStatus.BAD_REQUEST);
		repository.delete(request.get());
		return new ResponseEntity<Personne>(new Personne(), HttpStatus.OK);
	}*/
	
	@GetMapping("/personne")
	public String personneName() {return "Dadinio";}

}
