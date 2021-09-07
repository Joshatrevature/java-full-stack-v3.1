import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipetest',
  templateUrl: './pipetest.component.html',
  styleUrls: ['./pipetest.component.css']
})
export class PipetestComponent implements OnInit {

  name = 'Mark smith';

  constructor() { }

  ngOnInit(): void {
  }

}
