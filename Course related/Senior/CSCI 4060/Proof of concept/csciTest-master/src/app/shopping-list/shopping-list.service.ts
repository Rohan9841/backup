// import { EventEmitter } from "@angular/core";
import { Subject } from "rxjs";

import { Ingredients } from "../shared/ingredient.model";

export class ShoppingListService {
  // ingredientsChanged = new EventEmitter<Ingredients[]>();
  ingredientsChanged = new Subject<Ingredients[]>();

  editShopList = new Subject<number>();
  //ingredients array of type "Ingredients Model"
  private ingredients: Ingredients[] = [
    new Ingredients("Apple", 20),
    new Ingredients("Grape", 8)
  ];
  constructor() {}

  getIngredients() {
    return this.ingredients.slice();
  }

  getIngredient(id: number) {
    return this.ingredients[id];
  }

  addIngredients(ingredient: Ingredients) {
    this.ingredients.push(ingredient);
    // this.ingredientsChanged.emit(this.ingredients.slice());
    this.ingredientsChanged.next(this.ingredients.slice());
  }

  addIngredientsFrmRecipe(recipeIngredients: Ingredients[]) {
    this.ingredients.push(...recipeIngredients);
    // this.ingredientsChanged.emit(this.ingredients.slice());
    this.ingredientsChanged.next(this.ingredients.slice());
  }

  updateIngredient(index: number, newIngredient: Ingredients) {
    this.ingredients[index] = newIngredient;
    this.ingredientsChanged.next(this.ingredients.slice());
  }
  deleteIngredient(index: number) {
    this.ingredients.splice(index, 1);
    this.ingredientsChanged.next(this.ingredients.slice());
  }
}
