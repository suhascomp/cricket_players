import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PlayersRoutingModule } from './players-routing.module';
import { PlayerComponent } from './player/player.component';
import { InningComponent } from './inning/inning.component';
import { AddPlayerComponent } from './player/add-player/add-player.component';


@NgModule({
  declarations: [PlayerComponent, InningComponent, AddPlayerComponent],
  imports: [
    CommonModule,
    PlayersRoutingModule
  ]
})
export class PlayersModule { }
