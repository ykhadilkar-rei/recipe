package net.khadilkar.recipe.repositories;

import net.khadilkar.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Yatin on 07/25
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
