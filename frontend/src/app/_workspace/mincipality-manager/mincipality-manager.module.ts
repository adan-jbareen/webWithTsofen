import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { MincipalityManagerRoutingModule } from './mincipality-manager-routing.module';
import {CommonUtilsModule } from '../common-utils/common-utils.module';
import { SharedModule } from '../../shared/shared.module';
import { AddStudentComponent } from './add-student/add-student.component';

@NgModule({
  declarations: [
    AddStudentComponent
  ],
  imports: [
    CommonModule,
    MincipalityManagerRoutingModule,
    CommonUtilsModule,
    SharedModule
  ]
})
export class MincipalityManagerModule { }
