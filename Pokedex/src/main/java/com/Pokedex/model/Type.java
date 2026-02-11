package com.Pokedex.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="type")
public class Type {

	

			@Id
			@GeneratedValue(strategy=GenerationType.IDENTITY)
			@Column(name = "type_id")
			private int typeId;
			
			
			@Column(name = "type_name")
			private String typeName;
			
			@JsonIgnore
			@ManyToMany(mappedBy = "types")
			private List<Pokemon> pokemonList;


			
}
