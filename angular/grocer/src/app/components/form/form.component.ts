import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/user.model';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {

  userModel = new User('Mark', 'm@gmail.com', '9999', '123456', 'USA', 'male', true)
  countries = ['usa', 'uk', 'japan']
  constructor() { }

  ngOnInit(): void {
  }

  onFormSubmit(data: any){
    console.log(data)
  }


}
