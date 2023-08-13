import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  constructor(private httpClient: HttpClient) { }

  saveStudent(id: number, name: string, marks: number) {
    return this.httpClient.get('./student/save?id='+id+"&name="+name+"&marks="+marks);
  }
}
