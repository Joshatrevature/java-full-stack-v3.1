import { Component, OnInit } from '@angular/core';
import { IPost } from 'src/app/post.model';
import { DataService } from 'src/app/services/data.service';

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent implements OnInit {

  public posts: IPost[] = [];


  constructor(private dataService: DataService) {
     this.dataService.getPosts().subscribe((x) => {
       this.posts = x
     })

   }

  ngOnInit(): void {
  }

}
