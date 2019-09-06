package tacos.data;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import tacos.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient,String>{
	
	public static final String findTypes = "SELECT DISTINCT type FROM Ingredient";
	@Query(value = findTypes,nativeQuery = true)
	List<String> findAllTypes();
}
