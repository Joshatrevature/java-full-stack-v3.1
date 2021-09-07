import { Component, OnInit } from '@angular/core';
import { IPhoto } from 'src/app/photo.model';
import { IPost } from 'src/app/post.model';
import { DataService } from 'src/app/services/data.service';

@Component({
  selector: 'app-photos',
  templateUrl: './photos.component.html',
  styleUrls: ['./photos.component.css']
})
export class PhotosComponent implements OnInit {

  public photos: IPhoto[] = [];

  constructor(private dataService: DataService) {
    this.dataService.getPhotos().subscribe(data => this.photos = data)
      
    // this.dataService.getPhotos().subscribe(function(data){

    // })

   }

  ngOnInit(): void {
  }

}