import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { IPost } from '../post.model';
import { IPhoto } from '../photo.model';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http: HttpClient) { }

  getPosts(): Observable<IPost[]>{
    return this.http.get<IPost[]>('https://jsonplaceholder.typicode.com/posts')
  }

  getPhotos(): Observable<IPhoto[]>{
    return this.http.get<IPhoto[]>('https://jsonplaceholder.typicode.com/photos');
  }

}
