package com.orchestre.tehamnewversion.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/v1/")
public class RdvController {
	
	/*@Autowired
	RdvRepository repository;
	
	public RdvController(RdvRepository repository) {
		this.repository = repository;
	}*/
	
	
	/*	@GetMapping("/Rdv")
 	ResponseEntity<List<Rdv>> allRdv(){
	List<Rdv> rdv = new ArrayList<>();
	Iterable<Rdv> iterable = repository.findAll();
	iterable.forEach(a -> {
		rdv.add(a);
	});
	return new ResponseEntity<List<Rdv>>(rdv, HttpStatus.OK);
	}*/
	
	
	
	/*@GetMapping("/rdv/{id}")
	ResponseEntity<Rdv> oneRdv(@PathVariable Long id){
		Optional<Rdv> request = repository.findById(id);
		if(!request.isPresent())
			return new ResponseEntity<Rdv>(new Rdv(), HttpStatus.BAD_REQUEST);
		return new ResponseEntity<Rdv>(request.get(), HttpStatus.OK);	
	}*/
	
	/*
	@PostMapping("/rdv")
	ResponseEntity<Rdv> newRdv(@RequestBody Rdv r){
		Rdv rdv = repository.save(r);
		return new ResponseEntity<Rdv>(rdv, HttpStatus.OK);
	}*/
	
	/*
	@PutMapping("/rdv/{id}")
	ResponseEntity<Rdv> updateRdv(@PathVariable Long id, @RequestBody Rdv r){
		Optional<Rdv> request = repository.findById(id);
		if(!request.isPresent())
			return new ResponseEntity<Rdv>(new Rdv(), HttpStatus.BAD_REQUEST);
		Rdv rdv = request.get();
		rdv.setDate(r.getDate());
		repository.save(rdv);
		return new ResponseEntity<Rdv>(rdv, HttpStatus.OK);
	}*/
	
	/*
	@DeleteMapping("/rdv/{id}")
	ResponseEntity<Rdv> deleteRdv(@PathVariable Long id){
		Optional<Rdv> request = repository.findById(id);
		if(!request.isPresent())
			return new ResponseEntity<Rdv>(new Rdv(), HttpStatus.BAD_REQUEST);
		repository.delete(request.get());
		return new ResponseEntity<Rdv>(new Rdv(), HttpStatus.OK);
	}*/
	
	@GetMapping("/rdv")
	public String dateValue() {return "25-25-2021";}
	
	
	@GetMapping("/enregistrement")
	public String enregistrement() {return "okay";}

}
