import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";
import { LoginComponent } from "./login/login.component";
import { LogoutComponent } from "./logout/logout.component";
import { RouteGuardService } from "./service/route-guard.service";
import { CreateFormComponent } from "./create-form/create-form.component";
import { ErrorPageComponent } from "./error-page/error-page.component";
import { DisplayDataComponent } from "./display-data/display-data.component";
import { WelcomeComponent } from "./welcome/welcome.component";

const routes: Routes = [
  { path: "", component: LoginComponent },
  { path: "login", component: LoginComponent },
  {
    path: "welcome/:name",
    component: WelcomeComponent,
    canActivate: [RouteGuardService]
  },
  {
    path: "form",
    component: CreateFormComponent,
    canActivate: [RouteGuardService]
  },
  {
    path: "display",
    component: DisplayDataComponent,
    canActivate: [RouteGuardService]
  },
  {
    path: "logout",
    component: LogoutComponent,
    canActivate: [RouteGuardService]
  },

  { path: "**", component: ErrorPageComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
