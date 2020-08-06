import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Address } from './bean/address';

const url = 'http://localhost:8080/address';
@Injectable({
  providedIn: 'root'
})
export class AddressService {

  constructor( private http: HttpClient) { }
  getListAddress(): Observable<Address[]> {
   return this.http.get<Address[]>(url);
  }
  getAddressById(id): Observable<Address> {
    const api = `${url}/${id}`;
    return this.http.get<Address>(api);
   }
   addAddress(object): Observable<Address> {
     const add = `${url}/add`;
     return this.http.post<Address>(add, object);
   }
    updateAddress(object, id): Observable<Address> {
      const update = `${url}/update/${id}`;
      return this.http.put<Address>(update, object);
    }
    deleteAdress(id): Observable<Address> {
      const remove = `${url}/delete/${id}`;
      return this.http.delete<Address>(remove);

    }
}
