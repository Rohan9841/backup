import { Component, OnInit } from "@angular/core";
import { Router } from "@angular/router";
import { HardcodedAuthenticationService } from "../service/hardcoded-authentication.service";
import { NgForm } from "@angular/forms";

@Component({
  selector: "app-login",
  templateUrl: "./login.component.html",
  styleUrls: ["./login.component.css"]
})
export class LoginComponent implements OnInit {
  errorMessage = "Invalid Credentials";
  invalidLogin = false;
  isLoginMode = true;
  isLoading = false;

  constructor(
    private router: Router,
    private hardcodedAuthentication: HardcodedAuthenticationService
  ) {}

  ngOnInit() {
    this.hardcodedAuthentication.logout();
  }

  onSwitchMode() {
    this.isLoginMode = !this.isLoginMode;
  }

  onSubmit(form: NgForm) {
    if (!form.valid) {
      return;
    }
    const username = form.value.username;
    const password = form.value.password;

    this.isLoading = true;
    if (this.isLoginMode) {
      if (this.hardcodedAuthentication.authenticate(username, password)) {
        this.router.navigate(["welcome", username]);
        this.invalidLogin = false;
      } else {
        this.invalidLogin = true;
      }
      this.isLoading = false;
    }
    this.isLoading = false;
    form.reset();
  }
}
