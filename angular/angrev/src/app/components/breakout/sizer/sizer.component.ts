import { Component, OnInit, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-sizer',
  templateUrl: './sizer.component.html',
  styleUrls: ['./sizer.component.css']
})
export class SizerComponent implements OnInit {


  
  @Output() sizechange = new EventEmitter<number>();
  count2: number = 0;
  dec() { this.adder(this.count2--); }
  inc() { this.adder(this.count2++); }

  adder(count2: number) {
    this.sizechange.emit(count2)
  }
  constructor() { }

  ngOnInit(): void {
  }

}
