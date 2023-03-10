import { Component } from '@angular/core';
import { Employee } from '../employee';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-employee2',
  templateUrl: './employee2.component.html',
  styleUrls: ['./employee2.component.css']
})
export class Employee2Component {
  constructor(private service: ServiceService) { }
  employee: Employee = new Employee();
  onclick() {
   console.log(this.employee);
     this.service.addDetail(this.employee).subscribe((data) => {
       console.log(data);
       })
    }
}
