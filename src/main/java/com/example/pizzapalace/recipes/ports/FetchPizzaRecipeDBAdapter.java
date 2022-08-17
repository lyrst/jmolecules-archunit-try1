package com.example.pizzapalace.recipes.ports;

import com.example.pizzapalace.recipes.models.Recipe;
import io.vavr.API;
import io.vavr.collection.List;
import org.jmolecules.architecture.hexagonal.SecondaryAdapter;

@SecondaryAdapter
public class FetchPizzaRecipeDBAdapter implements FetchPizzaRecipePort{
    @Override
    public List<Recipe> getGrandmasFavoriteRecipes() {
        return API.List();
    }
}
