import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CommonUtilsRoutingModule } from './common-utils-routing.module';
import { ScreenContainerComponent } from './screen-container/screen-container.component';
import { ComponentsModule } from '../../shared/components/components.module';

@NgModule({
  declarations: [
    ScreenContainerComponent
  ],
  imports: [
    CommonModule,
    CommonUtilsRoutingModule,
    ComponentsModule
  ],
  exports: [
    ScreenContainerComponent
  ]
})
export class CommonUtilsModule { }
