import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Service } from './bean/Service';


const url = "http://localhost:8080/service";

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http:HttpClient) { }

  getListService(): Observable<Service[]>{
    return this.http.get<Service[]>(url);
  }
}
