package com.Pokedex.services;

import java.util.List;

import com.Pokedex.model.Type;

public interface TypeService {
	//GET
	public List<Type> getAllType();
		
	//GET a POKEMON by an ID
	public Type getTypeById(int id);
		
	//CREATE a POKEMON -> POST
	public Type saveType (Type type);
		
	//Update a POKEMON -> PUT
	public Type updateType(Type type, int id);
		
	//DELETE
	public void deleteType(int id);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
