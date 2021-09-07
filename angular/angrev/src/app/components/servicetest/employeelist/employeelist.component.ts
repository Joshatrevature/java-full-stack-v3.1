import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/data.service';

@Component({
  selector: 'app-employeelist',
  templateUrl: './employeelist.component.html',
  styleUrls: ['./employeelist.component.css']
})
export class EmployeelistComponent implements OnInit {

  employees: any[] = [];

  constructor(private dataService: DataService) { 
    
    this.employees = dataService.getEmployees()
  }

  ngOnInit(): void {
  }

}
