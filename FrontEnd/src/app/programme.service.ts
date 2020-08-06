import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Programme } from './bean/Programme';


const url = "http://localhost:8080/programe";

@Injectable({
  providedIn: 'root'
})
export class ProgrammeService {

  constructor(private http: HttpClient) { }

  getListProgramme(): Observable<Programme[]>{
    return this.http.get<Programme[]>(url);
  }
  addProgramme(programme): Observable<Programme>{
    return this.http.post<Programme>(`${url}/add`, programme);
  }
  getProgrammeById(id): Observable<Programme>{
    return this.http.get<Programme>(`${url}/${id}`);
  }

  editProgramme(programme): Observable<Programme>{
    return this.http.put<Programme>(`${url}/update/${programme.programmeId}`, programme);
  }
}
