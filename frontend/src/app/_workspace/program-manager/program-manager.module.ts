import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProgramManagerRoutingModule } from './program-manager-routing.module';
import {CommonUtilsModule } from '../common-utils/common-utils.module';
import { SharedModule } from '../../shared/shared.module';
import { AddStudentComponent } from './add-student/add-student.component';

@NgModule({
  declarations: [
    AddStudentComponent
  ],
  imports: [
    CommonModule,
    ProgramManagerRoutingModule,
    CommonUtilsModule,
    SharedModule
  ]
})
export class ProgramManagerModule { }
