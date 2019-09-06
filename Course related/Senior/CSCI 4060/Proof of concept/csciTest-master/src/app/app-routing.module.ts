import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";
import { RecipesComponent } from "./recipes/recipes.component";
import { ShoppingListComponent } from "./shopping-list/shopping-list.component";
import { RecipeStartComponent } from "./recipes/recipe-start/recipe-start.component";
import { RecipeDetailComponent } from "./recipes/recipe-detail/recipe-detail.component";
import { RecipeEditComponent } from "./recipes/recipe-edit/recipe-edit.component";
import { LandingPageComponent } from "./landing-page/landing-page.component";
import { LoginPageComponent } from "./login-page/login-page.component";
import { RecipeResolveService } from "./recipes/recipes-resolver.service";

const appRoutes: Routes = [
  { path: "", component: LoginPageComponent, pathMatch: "full" },
  {
    path: "landing",
    component: LandingPageComponent,
    children: [
      {
        path: "recipes",
        component: RecipesComponent,
        children: [
          { path: "", component: RecipeStartComponent },
          { path: "new", component: RecipeEditComponent },
          {
            path: ":id",
            component: RecipeDetailComponent,
            resolve: [RecipeResolveService]
          },
          {
            path: ":id/edit",
            component: RecipeEditComponent,
            resolve: [RecipeResolveService]
          }
        ]
      },
      { path: "shopping-list", component: ShoppingListComponent }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(appRoutes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
