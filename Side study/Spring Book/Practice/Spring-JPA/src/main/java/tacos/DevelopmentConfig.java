package tacos;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tacos.data.IngredientRepository;
import tacos.data.TacoRepository;

@Configuration
public class DevelopmentConfig {

	@Bean
	public CommandLineRunner dataLoader(IngredientRepository repo, TacoRepository tacoRepo) { // user repo for ease of
																								// testing with a
																								// built-in user
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {

				Taco taco1 = new Taco();
				taco1.setName("Carnivore");
				taco1.setIngredients(Arrays.asList(new Ingredient("FLTO", "Flour Tortilla", "WRAP"),
						new Ingredient("COTO", "Corn Tortilla", "WRAP"),
						new Ingredient("GRBF", "Ground Beef", "PROTEIN"), new Ingredient("CARN", "Carnitas", "PROTEIN"),
						new Ingredient("TMTO", "Diced Tomatoes", "VEGGIES"),
						new Ingredient("LETC", "Lettuce", "VEGGIES"), new Ingredient("CHED", "Cheddar", "CHEESE"),
						new Ingredient("JACK", "Monterrey Jack", "CHEESE"), new Ingredient("SLSA", "Salsa", "SAUCE"),
						new Ingredient("SRCR", "Sour Cream", "SAUCE")));
				tacoRepo.save(taco1);

				Taco taco2 = new Taco();
				taco2.setName("Bovine Bounty");
				taco2.setIngredients(Arrays.asList(new Ingredient("FLTO", "Flour Tortilla", "WRAP"),
						new Ingredient("COTO", "Corn Tortilla", "WRAP"),
						new Ingredient("GRBF", "Ground Beef", "PROTEIN")));
				tacoRepo.save(taco2);

				Taco taco3 = new Taco();
				taco3.setName("Veg-Out");
				taco3.setIngredients(Arrays.asList(new Ingredient("LETC", "Lettuce", "VEGGIES"),
						new Ingredient("CHED", "Cheddar", "CHEESE"), new Ingredient("JACK", "Monterrey Jack", "CHEESE"),
						new Ingredient("SLSA", "Salsa", "SAUCE"), new Ingredient("SRCR", "Sour Cream", "SAUCE")));
				tacoRepo.save(taco3);
				
				Taco taco4 = new Taco();
				taco4.setName("Veg-Out");
				taco4.setIngredients(Arrays.asList(new Ingredient("LETC", "Lettuce", "VEGGIES"),
						new Ingredient("CHED", "Cheddar", "CHEESE"), new Ingredient("JACK", "Monterrey Jack", "CHEESE"),
						new Ingredient("SLSA", "Salsa", "SAUCE"), new Ingredient("SRCR", "Sour Cream", "SAUCE")));
				tacoRepo.save(taco4);
				
				Taco taco5 = new Taco();
				taco5.setName("Veg-Out");
				taco5.setIngredients(Arrays.asList(new Ingredient("LETC", "Lettuce", "VEGGIES"),
						new Ingredient("CHED", "Cheddar", "CHEESE"), new Ingredient("JACK", "Monterrey Jack", "CHEESE"),
						new Ingredient("SLSA", "Salsa", "SAUCE"), new Ingredient("SRCR", "Sour Cream", "SAUCE")));
				tacoRepo.save(taco5);
				
				Taco taco6 = new Taco();
				taco6.setName("Veg-Out");
				taco6.setIngredients(Arrays.asList(new Ingredient("LETC", "Lettuce", "VEGGIES"),
						new Ingredient("CHED", "Cheddar", "CHEESE"), new Ingredient("JACK", "Monterrey Jack", "CHEESE"),
						new Ingredient("SLSA", "Salsa", "SAUCE"), new Ingredient("SRCR", "Sour Cream", "SAUCE")));
				tacoRepo.save(taco6);
				
				Taco taco7= new Taco();
				taco7.setName("Veg-Out");
				taco7.setIngredients(Arrays.asList(new Ingredient("LETC", "Lettuce", "VEGGIES"),
						new Ingredient("CHED", "Cheddar", "CHEESE"), new Ingredient("JACK", "Monterrey Jack", "CHEESE"),
						new Ingredient("SLSA", "Salsa", "SAUCE"), new Ingredient("SRCR", "Sour Cream", "SAUCE")));
				tacoRepo.save(taco7);
				
				Taco taco8 = new Taco();
				taco8.setName("Veg-Out");
				taco8.setIngredients(Arrays.asList(new Ingredient("LETC", "Lettuce", "VEGGIES"),
						new Ingredient("CHED", "Cheddar", "CHEESE"), new Ingredient("JACK", "Monterrey Jack", "CHEESE"),
						new Ingredient("SLSA", "Salsa", "SAUCE"), new Ingredient("SRCR", "Sour Cream", "SAUCE")));
				tacoRepo.save(taco8);
				
				Taco taco9 = new Taco();
				taco9.setName("Veg-Out");
				taco9.setIngredients(Arrays.asList(new Ingredient("LETC", "Lettuce", "VEGGIES"),
						new Ingredient("CHED", "Cheddar", "CHEESE"), new Ingredient("JACK", "Monterrey Jack", "CHEESE"),
						new Ingredient("SLSA", "Salsa", "SAUCE"), new Ingredient("SRCR", "Sour Cream", "SAUCE")));
				tacoRepo.save(taco9);
				
				Taco taco10 = new Taco();
				taco10.setName("Veg-Out");
				taco10.setIngredients(Arrays.asList(new Ingredient("LETC", "Lettuce", "VEGGIES"),
						new Ingredient("CHED", "Cheddar", "CHEESE"), new Ingredient("JACK", "Monterrey Jack", "CHEESE"),
						new Ingredient("SLSA", "Salsa", "SAUCE"), new Ingredient("SRCR", "Sour Cream", "SAUCE")));
				tacoRepo.save(taco10);
				
				

			}
		};
	}

}