package com.csci.demo.data;

import org.springframework.data.repository.CrudRepository;

import com.csci.demo.domain.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
	
}
