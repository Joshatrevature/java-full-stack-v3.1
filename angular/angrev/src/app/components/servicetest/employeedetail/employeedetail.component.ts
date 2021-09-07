import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/data.service';

@Component({
  selector: 'app-employeedetail',
  templateUrl: './employeedetail.component.html',
  styleUrls: ['./employeedetail.component.css']
})
export class EmployeedetailComponent implements OnInit {

  employees: any[] = [];

  constructor(private dataService: DataService) { 
    let dataSerice = new DataService();
     this.employees =  dataSerice.getEmployees()
  }

  ngOnInit(): void {
  }

}
