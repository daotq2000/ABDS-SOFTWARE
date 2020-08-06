import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { ProgrammeService } from '../programme.service';
import { Programme } from '../bean/Programme';

@Component({
  selector: 'app-programme',
  templateUrl: './programme.component.html',
  styleUrls: ['./programme.component.css']
})
export class ProgrammeComponent implements OnInit {
  tabs = ['Detail 1', 'Detail 2'];
  programmes: Programme[] = [];

  isDiplay:boolean = false;
  isDiplayList: boolean = true;

  checked = true;
  isDisplayButton: boolean = true;
  constructor(private fb:FormBuilder,
    private programmeService:ProgrammeService) { } 

  ngOnInit(): void {
    
    this.getListOrg();
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


}
