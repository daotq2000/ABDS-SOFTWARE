import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ProgrammeService } from '../programme.service';
import { Programme } from '../bean/Programme';
import { Observable, of } from 'rxjs';
import { ActivatedRoute } from '@angular/router';
import { map, switchMap } from 'rxjs/operators';

@Component({
  selector: 'app-programme-list',
  templateUrl: './programme-list.component.html',
  styleUrls: ['./programme-list.component.css']
})
export class ProgrammeListComponent implements OnInit {
  tabs = ['Detail 1', 'Detail 2'];
  programmes: Programme[] = [];
  programmes2: Programme[] =[];
  proActive: Programme[] =[];
  proInactive: Programme[] = [];
  checked: boolean = false;

  showInactive(){
      if(this.checked==false){
        this.proInactive = this.programmes.filter(function(value){
          return value.isactive == false;
        })
        this.programmes2 = this.proInactive
        this.checked=true;
      }
      else{
        this.proActive = this.programmes.filter(function(value){
          return value.isactive == true;
        })
        this.programmes2 = this.proActive
        this.checked=false;
      }
  }
  observable = new Observable();
  showData2(){
    this.programmeService.getListProgramme().subscribe(value => this.programmes2 = this.programmes.filter(function(value){
      return value.isactive==true;
    }))
    // this.org2 = this.org.filter(function(value){
    //   return value.active==true;
    // })
    console.log(this.programmes)
    console.log(this.programmes2);
  }

  

  isDiplay:boolean = false;
  isDiplayList: boolean = true;

  isDisplayButton: boolean = true;
  constructor(private fb:FormBuilder,
    private programmeService:ProgrammeService,
    private activatedRoute: ActivatedRoute) { } 

  ngOnInit(): void {
    
    this.getListOrg();
    this.showData2();
  }
  
  change(){
    this.isDiplay=true;
    this.isDisplayButton = false;
    this.isDiplayList= false;
  }
  

  getListOrg(){
    this.programmeService.getListProgramme().subscribe(data =>{
      this.programmes = data;
      console.log(data);
    });
  }

  searchText;
 


}
