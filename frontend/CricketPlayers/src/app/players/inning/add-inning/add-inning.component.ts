import { Component, OnInit } from '@angular/core';
import { Inning } from '../../models/player.models';

@Component({
  selector: 'app-add-inning',
  templateUrl: './add-inning.component.html',
  styleUrls: ['./add-inning.component.scss']
})
export class AddInningComponent implements OnInit {

  inning = new Inning();
  matchTypes = ['T20', 'ONE_DAY', 'TEST'];
  constructor() { }

  ngOnInit(): void {
  }

}
