import { Component } from '@angular/core';
import { Employee } from '../employee';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-final',
  templateUrl: './final.component.html',
  styleUrls: ['./final.component.css']
})
export class FinalComponent {
  constructor(private service: ServiceService) { }

  employee: Employee = new Employee();
  onclick() {
     console.log(this.employee);
     this.service.addData(this.employee).subscribe((data) => {
       console.log(data);
     })
   }
   options = {
  "key": "rzp_test_7HdkaZ1xFGPomB", // Enter the Key ID generated from the Dashboard
  "amount": "50000", // Amount is in currency subunits. Default currency is INR. Hence, 50000 refers to 50000 paise
  "currency": "INR",
  "name": "Payment", //your business name
  "description": "Test Transaction",
     "image": "https://tse2.mm.bing.net/th?id=OIP.Ry9JPhESzGjFAKSBQ2V6hwHaFj&pid=Api&P=0",
  "order_id": "",
  "callback_url": "https://eneqd3r9zrjok.x.pipedream.net/",
  "prefill": {
    "name": "Gaurav Kumar", //your customer's name
    "email": "gaurav.kumar@example.com",
    "contact": "9000090000"
  },
  "notes": {
    "address": "Razorpay Corporate Office"
  },
  "theme": {
    "color": "#3399cc"
  }
};
rzp1:any;
  pay(){
 
    this.rzp1 = new this.service.nativeWindow.Razorpay(this.options);
    this.rzp1.open();
  }

}
