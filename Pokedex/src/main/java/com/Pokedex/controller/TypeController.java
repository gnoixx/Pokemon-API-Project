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

import com.Pokedex.model.Type;
import com.Pokedex.services.TypeService;

@RestController
@RequestMapping("/Pokedex/type")
public class TypeController {

	@Autowired
	private TypeService ps;
	
	
	
	@GetMapping
	public List<Type> getAllType(){
		return ps.getAllType();
		
	}
	
	@PostMapping
	public ResponseEntity<Type> saveType(@RequestBody Type type){
		return new ResponseEntity<Type>(ps.saveType(type), HttpStatus.CREATED);
		
	}
	
	@PutMapping("/type/{id}")
	public ResponseEntity<Type> update(@PathVariable int id, @RequestBody Type type) {
	    return ResponseEntity.ok(ps.updateType(type, id));
	    
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id){
		ps.deleteType(id);
	
	}
}
