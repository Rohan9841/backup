import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Data } from "src/app/data.model";
// import { tap } from "rxjs/operators";
// import { Data } from "src/app/data.model";

@Injectable({
  providedIn: "root"
})
export class PocDataService {
  constructor(private http: HttpClient) {}
  fetchData() {
    return this.http.get<Data>("http://ec2-107-22-133-112.compute-1.amazonaws.com:8080/ingredients");
  }

  storeData(data: Data) {
    this.http
      .post("http://ec2-107-22-133-112.compute-1.amazonaws.com:8080/ingredients", data)
      .subscribe(response => {
        console.log(response);
      });
  }
}
