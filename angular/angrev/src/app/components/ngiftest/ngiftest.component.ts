import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ngiftest',
  templateUrl: './ngiftest.component.html',
  styleUrls: ['./ngiftest.component.css']
})
export class NgiftestComponent implements OnInit {

  public display = false;
  public isLogginIn = false;
 
  constructor() { }

  ngOnInit(): void {
  }

}
