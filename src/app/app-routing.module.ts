import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BackdataComponent } from './backdata/backdata.component';
import { EmployeeComponent } from './employee/employee.component';
import { Employee2Component } from './employee2/employee2.component';
import { FinalComponent } from './final/final.component';
import { FormComponent } from './form/form.component';

const routes: Routes = [
  { path: 'one', component: FormComponent },
  { path: 'one1', component: Employee2Component },
  { path: 'final', component: FinalComponent },
  { path: 'back', component: BackdataComponent },

];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
