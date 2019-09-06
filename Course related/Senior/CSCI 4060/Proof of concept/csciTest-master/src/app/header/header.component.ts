import { Component, OnInit } from "@angular/core";
import { Router, ActivatedRoute } from "@angular/router";

import { DataStorageService } from "../shared/data-storage.service";
import { RecipeService } from "../recipes/recipe.service";
import { Recipe } from "../recipes/recipe.model";

@Component({
  selector: "app-header",
  templateUrl: "./header.component.html",
  styleUrls: ["./header.component.css"]
})
export class HeaderComponent implements OnInit {
  // @Output() navigateClick = new EventEmitter<string>();

  constructor(
    private router: Router,
    private route: ActivatedRoute,
    private dataStorageService: DataStorageService
  ) {}

  ngOnInit() {}

  logout() {
    // this.router.navigate(["../"], { relativeTo: this.route });
    this.router.navigate([""]);
  }

  onSaveData() {
    // const recipes = this.recipeService.getRecipes();

    this.dataStorageService.storeRecipes();
  }

  onFetchData() {
    this.dataStorageService.fetchRecipes().subscribe();
  }
  // navigateOnClick(feature: string) {
  //   this.navigateClick.emit(feature);
  // }
}
