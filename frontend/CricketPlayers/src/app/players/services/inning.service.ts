import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from '../../../environments/environment';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class InningService {
  baseUrl = environment.baseUrl;
  constructor(
    private http: HttpClient
  ) { }

  public saveInning(inning: any): Observable<any> {
    const url = this.baseUrl + 'innings/save-inning';
    return this.http.post(url, inning);
  }
}
