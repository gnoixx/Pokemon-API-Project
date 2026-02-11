package com.Pokedex.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.Pokedex.model.Trainer;
import com.Pokedex.repository.TrainerRepository;

import jakarta.transaction.Transactional;

@Service
public class TrainerServiceImpl implements TrainerService{

	@Autowired
	private TrainerRepository pr;
	
	
	public List<Trainer> getAllTrainer() {
		return pr.findAll();
	}

	
	public Trainer getTrainerById(int id) {
		return pr.findById(id)
	            .orElseThrow(() ->
	                new ResponseStatusException(HttpStatus.NOT_FOUND, "Trainer not found")
	            );
		
	}

	public Trainer saveTrainer(Trainer trainer) {
		return pr.save(trainer);
	}

	@Transactional
	public Trainer updateTrainer(Trainer incoming, int id) {
		Trainer existing = pr.findById(id)
	            .orElseThrow(() ->
	                new ResponseStatusException(HttpStatus.NOT_FOUND, "Trainer not found")
	            );

	        existing.setTrainer_name(incoming.getTrainer_name());
	        
	        return pr.save(existing);
	    }

	
	public void deleteTrainer(int id) {
		if (!pr.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Trainer not found");
        }

        pr.deleteById(id);
    }

}
