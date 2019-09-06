import { Injectable } from "@angular/core";
// import { Subject } from "rxjs";

import { Recipe } from "./recipe.model";
import { Ingredients } from "../shared/ingredient.model";
import { ShoppingListService } from "../shopping-list/shopping-list.service";
import { Subject } from "rxjs";

@Injectable({
  providedIn: "root"
})
export class RecipeService {
  // selectRecipe = new EventEmitter<Recipe>();
  recipesChanged = new Subject<Recipe[]>();
  OrgRecipesChanged = new Subject<Recipe[]>();
  recipesDeleted = new Subject<Recipe[]>();

  constructor(private slService: ShoppingListService) {}

   private recipes: Recipe[] = [
     new Recipe(
       "Momo",
       "This is simply a test",
       "https://upload.wikimedia.org/wikipedia/commons/6/6c/Plateful_of_Momo_in_Nepal.jpg",
       "Onion"
     )
   ];

  // recipes array of type 'Recipe' Model
  //private recipes: Recipe[] = [];

  // private orgRecipes: Recipe[] = [];

  // setRecipes(recipes: Recipe[]) {
  //   this.recipes = recipes;
  //   this.recipesChanged.next(this.recipes.slice());
  // }

  setRecipes(recipes: Recipe[]) {
    this.recipes = recipes;
    // this.orgRecipes = [];
    // this.orgRecipes = recipes;
    // for (let recipe of recipes) {
    //   this.orgRecipes.push(recipe);
    // }
    this.recipesChanged.next(this.recipes.slice());
  }

  // setOrgRecipes(recipes: Recipe[]) {
  //   this.orgRecipes = [];
  //   // for (let recipe of recipes) {
  //   //   this.orgRecipes.push(recipe);
  //   // }
  //   this.OrgRecipesChanged.next(this.orgRecipes.slice());
  // }

  getRecipes() {
    return this.recipes.slice();
  }

  // getOrgRecipes() {
  //   for (let recipe of this.recipes) {
  //     this.orgRecipes.push(recipe);
  //   }
  //   return this.orgRecipes.slice();
  // }
  // getRecipesLength() {
  //   return this.getRecipes().length;
  // }

  getRecipe(index: number) {
    return this.recipes[index];
  }

  addIngredientsToShoppingList(ingredients: Ingredients[]) {
    this.slService.addIngredientsFrmRecipe(ingredients);
  }

  addRecipe(recipe: Recipe) {
    // console.log("New Recipe added here:  ", recipe);
    this.recipes.push(recipe);
    // this.orgRecipes.push(recipe);
    // console.log("Recipe: ", this.recipes);
    // console.log("OrgRecipes: ", this.orgRecipes);
    // this.OrgRecipesChanged.next(this.orgRecipes.slice());
    this.recipesChanged.next(this.recipes.slice());
  }

  // addOrgRecipe(recipe: Recipe) {
  //   this.orgRecipes.push(recipe);
  //   this.recipesChanged.next(this.recipes.slice());
  // }

  updateRecipe(index: number, newRecipe: Recipe) {
    this.recipes[index] = newRecipe;
    this.recipesChanged.next(this.recipes.slice());
  }

  deleteRecipe(index: number) {
    this.recipes.splice(index, 1);
    this.recipesChanged.next(this.recipes.slice());
  }

  // deleteIngredient(RecipeIndex: number, IngredientIndex: number) {
  //   console.log("Before deleting ingredients----- ");
  //   console.log("Recipe Index: " + RecipeIndex);
  //   console.log("Ingredient Index: " + IngredientIndex);

  //   this.recipes[RecipeIndex].ingredients.splice(IngredientIndex, 1);
  //   this.recipesChanged.next(this.recipes.slice());

  //   console.log("After deleting ingredients----- ");
  //   console.log("Recipe Index: " + RecipeIndex);
  //   console.log("Ingredient Index: " + IngredientIndex);
  // }
}
