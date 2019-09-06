import { Component, OnInit } from "@angular/core";
import { Data } from "../data.model";
import { PocDataService } from "../service/data/poc-data.service";
// import { format } from "path";
import { NgForm } from "@angular/forms";

@Component({
  selector: "app-create-form",
  templateUrl: "./create-form.component.html",
  styleUrls: ["./create-form.component.css"]
})
export class CreateFormComponent implements OnInit {
  // private testData: Data;
  userid: string;
  username: string;
  constructor(private pocDataService: PocDataService) {}

  ngOnInit() {}
  onSubmit(form: NgForm) {
    const value = form.value;
    this.userid = value.id;
    this.username = value.name;
    this.pocDataService.storeData(new Data(this.userid, this.username));
    form.reset();
  }
}
