import {
  Component,
  OnInit,
  ViewChild,
  ElementRef,
  Output,
  EventEmitter,
  OnDestroy
} from "@angular/core";
import { NgForm } from "@angular/forms";
import { Subscription } from "rxjs";

import { Ingredients } from "src/app/shared/ingredient.model";
import { ShoppingListService } from "../shopping-list.service";

@Component({
  selector: "app-shopping-edit",
  templateUrl: "./shopping-edit.component.html",
  styleUrls: ["./shopping-edit.component.css"]
})
export class ShoppingEditComponent implements OnInit, OnDestroy {
  //using @ViewChild to get the value of the input fields from the form

  // @ViewChild("inputName", { static: false }) shopInputName: ElementRef;
  // @ViewChild("inputAmount", { static: false }) shopInputAmount: ElementRef;
  // @Output() addShopItem = new EventEmitter<Ingredients>();
  @ViewChild("f", { static: false }) slForm: NgForm; //getting access to the shopping list form
  subscription: Subscription;
  editShopMode = false;
  editedItemIndex: number;
  editedItem: Ingredients;
  constructor(private slService: ShoppingListService) {}

  ngOnInit() {
    this.subscription = this.slService.editShopList.subscribe(
      (index: number) => {
        this.editShopMode = true;
        this.editedItemIndex = index;
        this.editedItem = this.slService.getIngredient(index);
        this.slForm.setValue({
          name: this.editedItem.name,
          amount: this.editedItem.amount
        });
      }
    );
  }

  onSubmit(form: NgForm) {
    // const newIngName = this.shopInputName.nativeElement.value;
    // const newIngAmt = this.shopInputAmount.nativeElement.value;
    // const newIngItem = new Ingredients(newIngName, newIngAmt)
    const value = form.value;
    const newIngItem = new Ingredients(value.name, value.amount);
    // this.addShopItem.emit(newIngItem);

    if (this.editShopMode) {
      this.slService.updateIngredient(this.editedItemIndex, newIngItem);
    } else {
      this.slService.addIngredients(newIngItem);
    }
    this.editShopMode = false;
    form.reset();
  }

  onClear() {
    this.slForm.reset();
    this.editShopMode = false;
  }

  onDelete() {
    this.slService.deleteIngredient(this.editedItemIndex);
    this.onClear();
  }

  ngOnDestroy() {
    this.subscription.unsubscribe();
  }
}
