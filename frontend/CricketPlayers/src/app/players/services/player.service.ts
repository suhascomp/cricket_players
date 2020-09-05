import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from '../../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class PlayerService {
baseUrl = environment.baseUrl;
  constructor(
    private http: HttpClient
  ) { }

  public savePlayer(player: any): Observable<any> {
    const url = this.baseUrl + 'players/save-player';
    return this.http.post(url, player);
  }
}
