import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { SchoolStaffRoutingModule } from './school-staff-routing.module';
import { AddStudentComponent } from './add-student/add-student.component';
import {CommonUtilsModule } from '../common-utils/common-utils.module';
import { SharedModule } from '../../shared/shared.module';
import { UpdateStudentComponent } from './update-student/update-student.component';


@NgModule({
  declarations: [
    AddStudentComponent,
    UpdateStudentComponent
  ],
  imports: [
    CommonModule,
    SchoolStaffRoutingModule,
    CommonUtilsModule,
    SharedModule
  ]
})
export class SchoolStaffModule { }
