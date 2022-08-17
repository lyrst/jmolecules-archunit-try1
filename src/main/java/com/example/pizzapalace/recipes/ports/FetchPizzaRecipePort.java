package com.example.pizzapalace.recipes.ports;

import com.example.pizzapalace.recipes.models.Recipe;
import io.vavr.collection.List;
import org.jmolecules.architecture.hexagonal.SecondaryPort;

@SecondaryPort
public interface FetchPizzaRecipePort {

    public List<Recipe> getGrandmasFavoriteRecipes();
}

