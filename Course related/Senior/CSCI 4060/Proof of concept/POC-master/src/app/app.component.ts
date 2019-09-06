import { Component } from "@angular/core";
import { HttpClient } from "@angular/common/http";
// import { Data } from "@angular/router";
import { tap } from "rxjs/operators";
import { Data } from "./data.model";
// import { Data } from '@angular/router';

@Component({
  selector: "app-root",
  templateUrl: "./app.component.html",
  styleUrls: ["./app.component.css"]
})
export class AppComponent {
  title = "test";
  id: string;
  name: string;

  private testData: Data =
    new Data("ca", "carrot");

  constructor(private http: HttpClient) {}
  fetchData() {
    return this.http
      .get<Data>("http://ec2-54-221-108-81.compute-1.amazonaws.com:8080/ingredients")
      .pipe(
        tap(data => {
          console.log(data);
          console.log("data is received");
        })
      )
      .subscribe(response => {
        console.log(Response);
      });
  }

  storeData() {
    this.http
      .post("http://ec2-54-221-108-81.compute-1.amazonaws.com:8080/ingredients", this.testData)
      .subscribe(response => {
        console.log(response);
      });
  }
}
