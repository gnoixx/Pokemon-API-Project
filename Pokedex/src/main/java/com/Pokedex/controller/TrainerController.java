package com.Pokedex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Pokedex.model.Trainer;
import com.Pokedex.services.TrainerService;

@RestController
@RequestMapping("/Pokedex/trainer")
public class TrainerController {

	@Autowired
	private TrainerService ps;
	
	@GetMapping
	public List<Trainer> getAlltrainer(){
		return ps.getAllTrainer();
	}
	
	@PostMapping
	public ResponseEntity<Trainer> saveTrainer(@RequestBody Trainer trainer){
		return new ResponseEntity<Trainer>(ps.saveTrainer(trainer), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id){
		ps.deleteTrainer(id);
	}
	
	
	
}
