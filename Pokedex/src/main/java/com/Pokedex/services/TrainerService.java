package com.Pokedex.services;

import java.util.List;

import com.Pokedex.model.Trainer;

public interface TrainerService {
	//GET
		public List<Trainer> getAllTrainer();
		
		//GET a Trainer by an ID
		public Trainer getTrainerById(int id);
		
		//CREATE a Trainer -> POST
		public Trainer saveTrainer (Trainer trainer);
		
		//Update a Trainer -> PUT
		public Trainer updateTrainer(Trainer trainer, int id);
		
		//DELETE
		public void deleteTrainer(int id);
	
	
	
	
}
