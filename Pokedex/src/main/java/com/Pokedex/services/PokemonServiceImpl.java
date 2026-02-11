package com.Pokedex.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.Pokedex.model.Pokemon;
import com.Pokedex.repository.PokemonRepository;

import jakarta.transaction.Transactional;

@Service
public class PokemonServiceImpl implements PokemonService{

	
	public Pokemon getPokemonDetails(int id) {
	    Pokemon pokemon = pr.findById(id)
	        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

	    return pokemon;
	    
	}
	
	
	
	@Autowired
	private PokemonRepository pr;
	
	@Override
	public List<Pokemon> getAllPokemon() {
		return pr.findAll();
	}
	
	@Override
	public Pokemon getPokemonById(int id) {
		return pr.findById(id)
				.orElseThrow(() ->
	            new ResponseStatusException(HttpStatus.NOT_FOUND, "Pokemon not found")
	        );
		
	}

	@Override
	public Pokemon savePokemon(Pokemon pokemon) {
		return pr.save(pokemon);
		
	}
	
	@Override
	@Transactional
	public Pokemon update(int id, Pokemon incoming) {
		
		Pokemon existing = pr.findById(id)
		        .orElseThrow(() ->
		            new ResponseStatusException(HttpStatus.NOT_FOUND, "Pokemon not found")
		        );

		    existing.setPokemonName(incoming.getPokemonName());
		    existing.setHeight(incoming.getHeight());
		    existing.setWeight(incoming.getWeight());
		    existing.setDex_id(incoming.getDex_id());
		    // set other fields, but NOT id

		    return pr.save(existing);
		}
		

	@Override
	public void deletePokemon(int id) {
		if (!pr.existsById(id)) {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Pokemon not found");
	    }
	    pr.deleteById(id);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
