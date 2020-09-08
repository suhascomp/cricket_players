import { Component, OnInit } from '@angular/core';
import { Registration } from '../models/login.models';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.scss']
})
export class RegistrationComponent implements OnInit {

  register = new Registration();
  constructor() { }

  ngOnInit(): void {
  }

}
