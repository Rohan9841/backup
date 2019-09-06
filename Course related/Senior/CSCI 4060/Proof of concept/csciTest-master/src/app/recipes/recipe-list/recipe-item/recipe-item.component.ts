import { Component, OnInit, Input, Output, EventEmitter } from "@angular/core";
import { Recipe } from "../../recipe.model";
// import { RecipeService } from "../../recipe.service";

@Component({
  selector: "app-recipe-item",
  templateUrl: "./recipe-item.component.html",
  styleUrls: ["./recipe-item.component.css"]
})
export class RecipeItemComponent implements OnInit {
  @Input() recipe: Recipe;
  @Input() id: number;
  // @Output() recipeItemSelect = new EventEmitter<void>();

  // constructor(private recipeService: RecipeService) {}

  ngOnInit() {}

  // onRecipeItemClick() {
  //   // this.recipeItemSelect.emit();
  //   this.recipeService.selectRecipe.emit(this.recipe);
}
