package com.Pokedex.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="pokemon")
public class Pokemon 
{


		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "pokemon_id")
		private int pokemonId;
				
		@ManyToMany
		@JoinTable
		(
		    name = "pokemon_type",
		    joinColumns = @JoinColumn(name = "pokemon_id"),
		    inverseJoinColumns = @JoinColumn(name = "type_id")
		)
		private List<Type> types;
		
		@JsonBackReference
		@ManyToOne
		@JoinColumn(name = "trainer_id")
		private Trainer trainer;
		
		@Column (name = "dex_id")
		private int dex_id;
		
		@Column(name="pokemon_name")
		private String pokemonName;
		
		@Column(name="height")
		private String height;
		
		@Column(name="weight")
		private double weight;
	
		
}
