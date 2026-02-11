package com.Pokedex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Pokedex.model.Pokemon;


	public interface PokemonRepository extends JpaRepository<Pokemon, Integer>{
		
	}

