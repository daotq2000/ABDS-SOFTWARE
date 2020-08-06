import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators, FormGroup } from '@angular/forms';
import { OrganisationService } from '../organisation.service';
import { Router, ActivatedRoute } from '@angular/router';
import { Organisation } from '../bean/Organisation';
import { map, switchMap } from 'rxjs/operators';
import { of } from 'rxjs';

@Component({
  selector: 'app-organisation-list',
  templateUrl: './organisation-list.component.html',
  styleUrls: ['./organisation-list.component.css']
})
export class OrganisationListComponent implements OnInit {

  organisationForm!: FormGroup;

  submitForm(): void {
    for (const i in this.organisationForm.controls) {
      this.organisationForm.controls[i].markAsDirty();
      this.organisationForm.controls[i].updateValueAndValidity();
    }
  }

  

  get orgname(){
    return this.organisationForm.get('orgname')
  }
  get address1(){
    return this.organisationForm.get('address1')
  }
  get charityNumber(){
    return this.organisationForm.get('charityNumber')
  }
  get cityTown(){
    return this.organisationForm.get('cityTown')
  }
  get companyNumber(){
    return this.organisationForm.get('companyNumber')
  }
  get contactId(){
    return this.organisationForm.get('contactId')
  }
  get country(){
    return this.organisationForm.get('country')
  }
  get email(){
    return this.organisationForm.get('email')
  }
  get exInternet(){
    return this.organisationForm.get('exInternet')
  }
  get fax(){
    return this.organisationForm.get('fax')
  }
  get fullDescription(){
    return this.organisationForm.get('fullDescription')
  }
  get nationCountry(){
    return this.organisationForm.get('nationCountry')
  }
  get phone(){
    return this.organisationForm.get('phone')
  }
  get preferenceOrg(){
    return this.organisationForm.get('preferenceOrg')
  }
  get shortDepcription(){
    return this.organisationForm.get('shortDepcription')
  }
  get sicCode(){
    return this.organisationForm.get('sicCode')
  }
  get website(){
    return this.organisationForm.get('website')
  }
  get active(){
    return this.organisationForm.get('active')
  }

  saveSchool() {
    if (this.organisationForm.value.orgId != null) {
      this.organisationService.editOrganisation(this.organisationForm.value).subscribe(data => {
        this.router.navigateByUrl('/org-list');
      });
    } else {
      // console.log(this.schoolForm);
      this.organisationService.addOrganisation(this.organisationForm.value).subscribe(data => {
        // this.router.routeReuseStrategy.shouldReuseRoute = () => false;
        // this.router.onSameUrlNavigation = 'reload';
        this.router.navigate(['org-list']);
      });
    }
  }

  showData() {
    this.activatedRoute.paramMap.pipe(
      map(params => params.get('id')),
      switchMap(id =>{ 
        if(id!=null){
          return this.organisationService.getOrganisationById(id)//chỗ này cần trả về một observable
        }
        else{
          return of();//chỗ này cần trả về một observable
        }
      })
    ).subscribe(data =>{
      if(data!=null){
        this.organisationForm.setValue(data);
      }
      else{
        this.organisationForm.setValue(this.organisationForm);
      }
    })
  }

  onSubmit(){
    
  }

  org: Organisation[] = [];

  isDiplay:boolean = false;
  isDiplayList: boolean = true;

  checked = true;
  isDisplayButton: boolean = true;
  constructor(private fb:FormBuilder,
    private organisationService:OrganisationService,
    private router:Router,
    private activatedRoute: ActivatedRoute) { } 

  ngOnInit(): void {
    
    this.getListOrg();
    this.showData();
    this.organisationForm = this.fb.group({
      orgId: this.fb.control(null),
      orgname: this.fb.control('', Validators.required),
      address1: this.fb.control('', Validators.required),
      charityNumber: this.fb.control('', Validators.required),
      cityTown: this.fb.control(''),
      companyNumber: this.fb.control('', Validators.required),
      contactId: this.fb.control('', Validators.required),
      country: this.fb.control('', Validators.required),
      email: this.fb.control('', Validators.required),
      exInternet: this.fb.control('', Validators.required),
      fax: this.fb.control(''),
      fullDescription: this.fb.control('', Validators.required),
      nationCountry: this.fb.control('', Validators.required),
      phone: this.fb.control('', Validators.required),
      preferenceOrg: this.fb.control('', Validators.required),
      shortDepcription: this.fb.control('', Validators.required),
      sicCode: this.fb.control('', Validators.required),
      website: this.fb.control('', Validators.required),
      active: this.fb.control('', Validators.required),
    })
  }
  
  change(){
    this.isDiplay=true;
    this.isDisplayButton = false;
    this.isDiplayList= false;
  }
  

  getListOrg(){
    this.organisationService.getListOrganisation().subscribe(data =>{
      this.org = data;
      console.log(data);
    });
  }

  popup(){
    console.log("Hello");
  }
}
