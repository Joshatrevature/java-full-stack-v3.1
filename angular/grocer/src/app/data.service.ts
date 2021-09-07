import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  


  constructor(private http: HttpClient) { }

  public sendGetRequest(){
    let url = "http://apolis-grocery.herokuapp.com/api-docs/#/default/get_api_category";
    return this.http.get(url);
  }
}
