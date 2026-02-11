package com.Pokedex.controller;

import java.util.List;

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

import com.Pokedex.model.Pokemon;
import com.Pokedex.services.PokemonService;


@RestController
@RequestMapping("/Pokedex/pokemon")
public class PlayerPokedex {

	@Autowired
	private PokemonService ps;
	
	@GetMapping
	public List<Pokemon> getAllPokemon(){
		return ps.getAllPokemon();
	}
	
	
	@PostMapping
	public ResponseEntity<Pokemon> savePokemon(@RequestBody Pokemon pokemon){
		return new ResponseEntity<Pokemon>(ps.savePokemon(pokemon), HttpStatus.CREATED);
	}
	
	
	@PutMapping("/{id}")
	public Pokemon update(@PathVariable int id, @RequestBody Pokemon pokemon) {
		return ps.update(id, pokemon);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id){
		ps.deletePokemon(id);
	}
	
}
