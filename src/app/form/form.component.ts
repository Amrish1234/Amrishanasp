import { Component } from '@angular/core';
import { Employee } from '../employee';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent {
  constructor(private service: ServiceService) { }

  employee: Employee = new Employee();
  onclick() {
    console.log(this.employee);
    this.service.addData(this.employee).subscribe((data) => {
      console.log(data);
    })
  }
}
