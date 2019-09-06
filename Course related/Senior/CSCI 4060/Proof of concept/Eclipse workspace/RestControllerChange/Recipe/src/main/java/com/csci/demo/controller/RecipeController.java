package com.csci.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.csci.demo.data.IngredientRepository;
import com.csci.demo.data.Recipe;
import com.csci.demo.data.RecipeRepository;
import com.csci.demo.domain.Ingredient;

@RepositoryRestController
public class RecipeController {

	private IngredientRepository repo;
	
	@Autowired
	public RecipeController(IngredientRepository repo) {
		this.repo = repo;
	}
	
	@PostMapping(consumes = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public Ingredient saveRecipe(@RequestBody Ingredient ingredient) {
		return repo.save(ingredient);
	}
}
