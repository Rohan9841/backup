package com.csci.demo.data;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.csci.demo.domain.Ingredient;

import lombok.Data;

@Data
@Entity
public class Recipe {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	private String description;
	private String imagePath;
	
	private String ingredient;
	
	private String name;
	
}
