import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Organisation } from './bean/Organisation';


const url = "http://localhost:8080/organisation";

@Injectable({
  providedIn: 'root'
})


export class OrganisationService {

  constructor(private http:HttpClient) { }

  getListOrganisation(): Observable<Organisation[]>{
    return this.http.get<Organisation[]>(url);
  }
  addOrganisation(organisation): Observable<Organisation>{
    return this.http.post<Organisation>(`${url}/add`, organisation);
  }
  getOrganisationById(id): Observable<Organisation>{
    return this.http.get<Organisation>(`${url}/${id}`);
  }

  editOrganisation(organisation): Observable<Organisation>{
    return this.http.put<Organisation>(`${url}/update/${organisation.orgId}`, organisation);
  }
}
