import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder } from '@angular/forms';
import { ProgrammeService } from '../programme.service';
import { Router, ActivatedRoute } from '@angular/router';
import { map, switchMap } from 'rxjs/operators';
import { of } from 'rxjs';

@Component({
  selector: 'app-programme-form',
  templateUrl: './programme-form.component.html',
  styleUrls: ['./programme-form.component.css']
})
export class ProgrammeFormComponent implements OnInit {
  programmeForm!: FormGroup;
  constructor(
    private fb: FormBuilder,
    private programmeService:ProgrammeService,
    private router:Router,
    private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.showData();
    this.programmeForm = this.fb.group({
      programmeId: this.fb.control(null),
      programeName: this.fb.control(''),
      description: this.fb.control(''),
      contactId: this.fb.control(''),
      isactive: this.fb.control('')
    })
  }

  get programeName(){
    return this.programmeForm.get('programeName')
  }
  get description(){
    return this.programmeForm.get('description')
  }
  get contactId(){
    return this.programmeForm.get('contactId')
  }
  get isactive(){
    return this.programmeForm.get('isactive')
  }
  
  submitForm(): void {
    for (const i in this.programmeForm.controls) {
      this.programmeForm.controls[i].markAsDirty();
      this.programmeForm.controls[i].updateValueAndValidity();
    }
  }

  saveProgramme() {
    if (this.programmeForm.value.programmeId != null) {
      this.programmeService.editProgramme(this.programmeForm.value).subscribe(data => {
        this.router.navigateByUrl('/list-pg');
      });
    } else {
      // console.log(this.schoolForm);
      this.programmeService.addProgramme(this.programmeForm.value).subscribe(data => {
        // this.router.routeReuseStrategy.shouldReuseRoute = () => false;
        // this.router.onSameUrlNavigation = 'reload';
        this.router.navigate(['/list-pg']);
      });
    }
  }
  showData() {
    this.activatedRoute.paramMap.pipe(
      map(params => params.get('id')),
      switchMap(id =>{ 
        if(id!=null){
          return this.programmeService.getProgrammeById(id)//chỗ này cần trả về một observable
        }
        else{
          return of();//chỗ này cần trả về một observable
        }
      })
    ).subscribe(data =>{
      if(data!=null){
        this.programmeForm.setValue(data);
      }
      else{
        this.programmeForm.setValue(this.programmeForm);
      }
    })
  }
}
