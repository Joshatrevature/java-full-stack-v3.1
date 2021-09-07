import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-stylebind',
  template: `
  <h1 style="color: pink">Heading</h1>
  <h1 [style.color]="hasError ? 'red' : 'green'">Some Heading</h1>
  <h1 [style.color]="specialColor" >Some Other heading</h1>
  <h1 [ngStyle]="customStyle" >Custmom Style</h1>
  `,
  styleUrls: ['./stylebind.component.css']
})
export class StylebindComponent implements OnInit {

  hasError = false;
  specialColor  = '#999999'
  public customStyle = {
    color: 'blue',
    fontStyle: 'italic'
  }

  constructor() { }

  ngOnInit(): void {
  }
}

