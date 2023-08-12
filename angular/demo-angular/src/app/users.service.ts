import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, map } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UsersService {

  constructor(private httpClient: HttpClient) { }
  getUsers(): Observable<User[]> {
    return this.httpClient.get('https://random-data-api.com/api/v2/users?size=10')
    .pipe(
      map((response: any) => {
        return response;
      })
    );
  }
}

// DTO
export interface User {
  phone_number?: string;
  first_name?: string;
  last_name?: string;

  email?: string;
  avatar?: string;
}