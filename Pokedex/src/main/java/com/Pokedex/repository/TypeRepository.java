package com.Pokedex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Pokedex.model.Type;


	public interface TypeRepository extends JpaRepository<Type, Integer>{

}
