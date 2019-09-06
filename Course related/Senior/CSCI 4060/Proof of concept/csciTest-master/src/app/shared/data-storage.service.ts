import { Injectable, OnDestroy } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { map, tap } from "rxjs/operators";
import { RecipeService } from "../recipes/recipe.service";
import { Recipe } from "../recipes/recipe.model";
// import deepEqual from "deep-equal";
// import {
//   diff,
//   addedDiff,
//   deletedDiff,
//   updatedDiff,
//   detailedDiff
// } from "deep-object-diff";
// import { DeepDiff } from "deep-diff";
// import { Subscription } from "rxjs";

@Injectable({
  providedIn: "root"
})
export class DataStorageService {
  // subscription: Subscription;
  // orgRecipes: Recipe[];
  constructor(private http: HttpClient, private recipeService: RecipeService) {}

  storeRecipes() {
    const recipes = this.recipeService.getRecipes();
    // this.subscription = this.recipeService.OrgRecipesChanged.subscribe(
    //   (newRecipes: Recipe[]) => {
    //     this.orgRecipes = newRecipes;
    //   }
    // );
    // this.orgRecipes = this.recipeService.getOrgRecipes();
    // console.log("Original Recipe: ", this.orgRecipes);
    // console.log("Updated Recipe: ", recipes);
    // console.log("Original Recipe: ", this.orgRecipes);
    // console.log("Updated Recipe: ", recipes);

    this.http
      .put(
        "localhost:8080/save",
        recipes
      )
      .subscribe(response => {
        console.log(response);
        // console.log(recipes);
        // console.log(this.orgRecipes);
      });
  }

  fetchRecipes() {
    return this.http
      .get<Recipe[]>(
        "https://ng-course-recipe-book-a399a.firebaseio.com/recipes.json"
      )
      .pipe(
        map(recipes => {
          return recipes.map(recipe => {
            return {
              ...recipe,
              ingredients: recipe.ingredients ? recipe.ingredients : []
            };
          });
        }),
        tap(recipes => {
          this.recipeService.setRecipes(recipes);
          // this.recipeService.setOrgRecipes(recipes);
          // console.log(this.recipeService.getRecipes());
          // console.log(this.recipeService.getOrgRecipes());
        })
      );
  }
}
