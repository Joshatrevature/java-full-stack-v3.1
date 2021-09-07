import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { DataService } from 'src/app/services/data.service';

@Component({
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.css']
})
export class CategoryComponent implements OnInit {

  public categories: any;
  public IMAGE_URL = 'http://rjtmobile.com/grocery/images/'

  constructor(private dataService: DataService, private router: Router) { }

  ngOnInit(): void {
    this.dataService.getCategory().subscribe((data) => {
      this.categories = data.data;
    })
  }

  onCategorySelected(category: any){
    this.router.navigate(['/products',category.catName, category.catId])
  }
}
