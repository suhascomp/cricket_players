import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { LayoutRoutingModule } from './layout-routing.module';
import { BlankComponent } from './blank/blank.component';
import { CommonLayoutComponent } from './common-layout/common-layout.component';


@NgModule({
  declarations: [BlankComponent, CommonLayoutComponent],
  imports: [
    CommonModule,
    LayoutRoutingModule
  ]
})
export class LayoutModule { }
