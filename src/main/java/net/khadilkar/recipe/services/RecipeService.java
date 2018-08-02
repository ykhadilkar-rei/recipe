package net.khadilkar.recipe.services;

import net.khadilkar.recipe.domain.Recipe;

import java.util.Set;

/**
 * Created by Yatin on 8/2/18
 */

public interface RecipeService {

    Set<Recipe> getRecipes();
}
