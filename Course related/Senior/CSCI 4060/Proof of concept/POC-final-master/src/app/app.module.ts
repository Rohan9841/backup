import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";
import { FormsModule } from "@angular/forms";

import { AppRoutingModule } from "./app-routing.module";
import { AppComponent } from "./app.component";
import { HttpClientModule } from "@angular/common/http";
import { CreateFormComponent } from "./create-form/create-form.component";
import { ErrorPageComponent } from './error-page/error-page.component';
import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';
import { MenuComponent } from './menu/menu.component';
import { DisplayDataComponent } from './display-data/display-data.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { NgxPopper } from 'angular-popper';
import { LoadingSpinnerComponent } from './loading-spinner/loading-spinner.component';
import { FooterComponent } from './footer/footer.component';

@NgModule({
  declarations: [AppComponent, CreateFormComponent, ErrorPageComponent, LoginComponent, LogoutComponent, MenuComponent, DisplayDataComponent, WelcomeComponent, LoadingSpinnerComponent, FooterComponent],
  imports: [BrowserModule, AppRoutingModule, HttpClientModule, FormsModule, NgxPopper],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}
