package com.example.pizzapalace.recipes.domain;

import com.example.pizzapalace.recipes.models.Recipe;
import com.example.pizzapalace.recipes.ports.FetchPizzaRecipePort;
import io.vavr.collection.List;
import org.jmolecules.architecture.hexagonal.Application;

@Application
public class RecipeService {

    private final FetchPizzaRecipePort fetchPizzaRecipePort;

    public RecipeService(FetchPizzaRecipePort fetchPizzaRecipePort) {
        this.fetchPizzaRecipePort = fetchPizzaRecipePort;
    }

    public List<Recipe> getRelevantRecipes() {
        return this.fetchPizzaRecipePort.getGrandmasFavoriteRecipes();
    }
}
