import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PlayersRoutingModule } from './players-routing.module';
import { PlayerComponent } from './player/player.component';
import { InningComponent } from './inning/inning.component';
import { AddPlayerComponent } from './player/add-player/add-player.component';
import {MatCardModule} from '@angular/material/card';
import { FormsModule } from '@angular/forms';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';
import {MatButtonModule} from '@angular/material/button';

@NgModule({
  declarations: [PlayerComponent, InningComponent, AddPlayerComponent],
  imports: [
    CommonModule,
    PlayersRoutingModule,
    MatCardModule,
    FormsModule,
    MatFormFieldModule,
    MatInputModule,
    MatButtonModule
  ],
  exports: [
    PlayerComponent, AddPlayerComponent
  ]
})
export class PlayersModule { }
