import { Component } from '@angular/core';
import { Employee } from '../employee';
import { ServiceService } from '../service.service';
@Component({
  selector: 'app-backdata',
  templateUrl: './backdata.component.html',
  styleUrls: ['./backdata.component.css']
})
export class BackdataComponent {
  // studentDetails:any = [];
  constructor(private service: ServiceService) {
    // this.getStudent();
   }
  // employee: Employee = new Employee();
  
  // getStudent(){
  //   this.service.getData().subscribe((resp)=>{
  //     console.log(resp);
  //     this.studentDetails = resp;  
  //   },
  //   (err)=>{
  //     console.log(err);
  //   }
  //   );
  // }
  employee: any;
  ngOnInit()
  {
    this.service.getDetail().subscribe((resp) => {
      console.log(resp);
      this.employee = resp;
    },
      (err) => {
        console.log(err);
      }
    );
  }
  }

