package com.csci.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.csci.demo.data.IngredientRepository;
import com.csci.demo.domain.Ingredient;

@EnableAutoConfiguration
@SpringBootApplication
public class RecipeApplication {

	@Bean
	  public CommandLineRunner dataLoader(IngredientRepository repo) {
	    return new CommandLineRunner() {
	      @Override
	      public void run(String... args) throws Exception {
	        repo.save(new Ingredient("tm","Tomato"));
	        repo.save(new Ingredient("on","Onion"));
	        repo.save(new Ingredient("ap","Apple"));
	        repo.save(new Ingredient("gp","Grape"));
	      }
	    };
}
	public static void main(String[] args) {
		SpringApplication.run(RecipeApplication.class, args);
	}

}
