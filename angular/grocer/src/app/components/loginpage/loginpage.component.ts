import { Component, OnInit } from '@angular/core';
import { Login } from 'src/app/login.model';


@Component({
  selector: 'app-loginpage',
  templateUrl: './loginpage.component.html',
  styleUrls: ['./loginpage.component.css']
})
export class LoginpageComponent implements OnInit {

  loginModel = new Login('email','password');
  constructor() { }

  ngOnInit(): void {
  }

  onFormSubmit(data: any){
    console.log(data)
  }
}
