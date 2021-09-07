import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-numbox',
  templateUrl: './numbox.component.html',
  styleUrls: ['./numbox.component.css']
})
export class NumboxComponent implements OnInit {

 
  @Input() count!: number;

  constructor() { }

 
  

  ngOnInit(): void {
  }

}
