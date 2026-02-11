package com.Pokedex.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="trainer")
public class Trainer 
{

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int list_id;
	
	@Column(name = "trainer_name")
	private String trainer_name;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "trainer", cascade = CascadeType.ALL)
	private List<Pokemon> pokemonList;

	
	
}
