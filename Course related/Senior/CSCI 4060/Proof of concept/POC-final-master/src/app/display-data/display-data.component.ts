import { Component, OnInit } from "@angular/core";
import { PocDataService } from "../service/data/poc-data.service";
import { Data } from "../data.model";

@Component({
  selector: "app-display-data",
  templateUrl: "./display-data.component.html",
  styleUrls: ["./display-data.component.css"]
})
export class DisplayDataComponent implements OnInit {
  fetchedData: Data[] = [];
  id: string;
  name: string;
  constructor(private pocDataService: PocDataService) {}
  ngOnInit() {}
  getData() {
    this.pocDataService.fetchData().subscribe(data => {
      let count: number = 0;
      const arrData = data["_embedded"].ingredients;
      arrData.forEach(element => {
        this.name = element.name;
        console.log(this.name);
        console.log(count);
        if (this.fetchedData.length < arrData.length) {
          this.addData(new Data(count.toString(), this.name));
        }
        count++;
      });

      // console.log(data["_embedded"].ingredients);
      console.log("data is received");
    });
  }

  addData(data: Data) {
    this.fetchedData.push(data);
  }
}
