import { Component, OnInit } from '@angular/core';
import { AddressService } from '../address.service';
import { Address } from '../bean/address';
import {ActivatedRoute, Router} from '@angular/router';
@Component({
  selector: 'app-address',
  templateUrl: './address.component.html',
  styleUrls: ['./address.component.css']
})
export class AddressComponent implements OnInit {
  listAdress: Array<Address>;
  constructor(private service: AddressService) { }

  ngOnInit(): void {
    this.getlistAddress();
  }
  getlistAddress() {
    this.service.getListAddress().subscribe(data => {
      console.log(data);
      this.listAdress = data;
    });
  }
}
