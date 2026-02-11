package com.Pokedex.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.Pokedex.model.Type;
import com.Pokedex.repository.TypeRepository;

@Service
public class TypeServiceImpl implements TypeService{

	
	
	@Autowired
	private TypeRepository pr;
	
	public List<Type> getAllType() {
		return pr.findAll();
		
	}

	
	public Type getTypeById(int id) {
		return pr.findById(id)
	            .orElseThrow(() ->
	                new ResponseStatusException(HttpStatus.NOT_FOUND, "Type not found")
	            );
		
	}

	
	public Type saveType(Type type) {
		return pr.save(type);
		
	}

	
	public Type updateType(Type type, int id) {
		Type existing = pr.findById(id)
		        .orElseThrow(() -> new RuntimeException("Type not found"));

		    existing.setTypeName(type.getTypeName());
		    return pr.save(existing);
		
	}
	
	
	public void deleteType(int id) {
		if (!pr.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Type not found");
        }

        pr.deleteById(id);
    
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
