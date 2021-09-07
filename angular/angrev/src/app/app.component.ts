import { Component, ViewChild } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})



export class AppComponent {
  
  li:any;
  lis=[];
  constructor(private http : HttpClient){
      
}
  
  ngOnInit(): void {
    this.http.get('https://jsonplaceholder.typicode.com/photos')
    .subscribe(Response => {
  
     
      
      console.log(Response)
      this.li=Response;
      this.lis=this.li.list;
    });
  
  }}