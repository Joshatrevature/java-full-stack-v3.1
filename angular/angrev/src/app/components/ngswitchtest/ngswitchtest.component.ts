import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ngswitchtest',
  templateUrl: './ngswitchtest.component.html',
  styleUrls: ['./ngswitchtest.component.css']
})
export class NgswitchtestComponent implements OnInit {

  public string = 'five';

  constructor() { }

  ngOnInit(): void {
  }

}
