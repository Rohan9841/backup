import { Directive, HostBinding, HostListener } from "@angular/core";

@Directive({
  selector: "[appDropdown]",
  exportAs: "appDropdown"
})
export class DropdownDirective {
  constructor() {}
  @HostBinding("class.show") isOpen: boolean = false;

  @HostListener("click") toggleOpen() {
    this.isOpen = !this.isOpen;
  }
}
