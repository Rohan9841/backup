import { Component, OnInit, OnDestroy } from "@angular/core";
import { Subscription } from "rxjs";

import { Ingredients } from "../shared/ingredient.model";
import { ShoppingListService } from "./shopping-list.service";

@Component({
  selector: "app-shopping-list",
  templateUrl: "./shopping-list.component.html",
  styleUrls: ["./shopping-list.component.css"]
})
export class ShoppingListComponent implements OnInit, OnDestroy {
  ingredients: Ingredients[];
  private ingChangeSub: Subscription;
  constructor(private slService: ShoppingListService) {}

  ngOnInit() {
    this.ingredients = this.slService.getIngredients();
    this.ingChangeSub = this.slService.ingredientsChanged.subscribe(
      (newIngredients: Ingredients[]) => (this.ingredients = newIngredients)
    );
  }
  editShopItem(index: number) {
    this.slService.editShopList.next(index);
  }

  ngOnDestroy(): void {
    this.ingChangeSub.unsubscribe();
  }

  // shoppingItem(ingredient: Ingredients) {
  //   this.ingredients.push(ingredient);
  // }
}
