import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-inputchild',
  templateUrl: './inputchild.component.html',
  styleUrls: ['./inputchild.component.css']
})
export class InputchildComponent implements OnInit {

  @Input() item = '';

  @Output() newItemEvent = new EventEmitter<string>();

  addNewItem(value: string) {
    this.newItemEvent.emit(value);
  }

  constructor() { }

  ngOnInit(): void {
  }

}
