import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, map } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BankService {
  constructor(private httpClient: HttpClient) { }
  getBanks(): Observable<Bank[]> {
    return this.httpClient.get('https://random-data-api.com/api/v2/banks?size=10')
    .pipe(
      map((response: any) => {
        return response;
      })
    );
  }
}
export interface Bank {
  id?: string;
  bank_name?:string;
  routing_number?:string;
  account_number?:string;
}
