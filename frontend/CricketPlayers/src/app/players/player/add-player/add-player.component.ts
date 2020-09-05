import { Component, OnInit } from '@angular/core';
import { PlayerService } from '../../services/player.service';
import { Player } from '../../models/player.models';


@Component({
  selector: 'app-add-player',
  templateUrl: './add-player.component.html',
  styleUrls: ['./add-player.component.scss']
})
export class AddPlayerComponent implements OnInit {

  player: any = new Player();

  constructor(
    private playerService: PlayerService
  ) { }

  ngOnInit(): void {
  }

  onSubmit(): void {
    console.log(this.player);
    this.playerService.savePlayer(this.player).subscribe((resp) => {

    }, (error) => {
      console.log(error);
    });
  }
}
