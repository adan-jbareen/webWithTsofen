import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddStudentComponent } from '../program-manager/add-student/add-student.component';
const routes: Routes = [{
  path:"add",
    component:AddStudentComponent
},];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProgramManagerRoutingModule { }
