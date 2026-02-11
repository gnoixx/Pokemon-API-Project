package com.Pokedex.services;

import java.util.List;

import com.Pokedex.model.Pokemon;

public interface PokemonService {
	//GET
	public List<Pokemon> getAllPokemon();
	
	//GET a POKEMON by an ID
	public Pokemon getPokemonById(int id);
	
	//CREATE a POKEMON -> POST
	public Pokemon savePokemon (Pokemon pokemon);
	
	//Update a POKEMON -> PUT
	public Pokemon update(int id, Pokemon pokemon);
	
	//DELETE
	public void deletePokemon(int id);

	
	
	
	
	
	
	
	
	
	
}
