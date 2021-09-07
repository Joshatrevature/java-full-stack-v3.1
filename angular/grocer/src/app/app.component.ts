import { Component } from '@angular/core';
import { DataService } from './data.service';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'grocer';
  users:any;
  constructor(private userData: DataService){
    this.userData.sendGetRequest().subscribe(data=>{
      this.users=data;
    })
  }
}
