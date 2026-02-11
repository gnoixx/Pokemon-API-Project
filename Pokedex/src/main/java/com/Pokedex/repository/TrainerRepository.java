package com.Pokedex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Pokedex.model.Trainer;


	public interface TrainerRepository extends JpaRepository<Trainer, Integer> {

	}
