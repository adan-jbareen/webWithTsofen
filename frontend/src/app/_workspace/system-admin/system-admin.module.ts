import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { SystemAdminRoutingModule } from './system-admin-routing.module';
import {CommonUtilsModule } from '../common-utils/common-utils.module';
import { SharedModule } from '../../shared/shared.module';
import { AddStudentComponent } from './add-student/add-student.component';

@NgModule({
  declarations: [
    AddStudentComponent
  ],
  imports: [
    CommonModule,
    SystemAdminRoutingModule,
    CommonUtilsModule,
    SharedModule
  ]
})
export class SystemAdminModule { }
