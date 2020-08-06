import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators, FormGroup, FormControl } from '@angular/forms';
import { Organisation } from '../bean/Organisation';
import { OrganisationService } from '../organisation.service';
import { Router, ActivatedRoute } from '@angular/router';
import { map, switchMap, catchError, timeout } from 'rxjs/operators';
import { of, interval, Observable } from 'rxjs';
// import { ITab } from '../bean/ITab';

@Component({
  selector: 'app-form-organisation',
  templateUrl: './form-organisation.component.html',
  styleUrls: ['./form-organisation.component.css']
})
export class FormOrganisationComponent implements OnInit {

  organisationForm!: FormGroup;

  checked: boolean = false;
  searchText;

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
    // if (this.organisationForm.value.id != null) {
    //   this.organisationForm.editSchool(this.schoolForm.value).subscribe(data => {
    //     this.router.navigateByUrl('/home');
    //   });
    // } else {
      // console.log(this.schoolForm);
      this.organisationService.addOrganisation(this.organisationForm.value).subscribe(data => {
        this.router.routeReuseStrategy.shouldReuseRoute = () => false;
        this.router.onSameUrlNavigation = 'reload';
        this.router.navigate(['/org-list']);
      });
    // }
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
  org2: Organisation[] =[];
  orgActive: Organisation[] =[];
  orgInactive: Organisation[] = [];
  showInactive(){
      if(this.checked==false){
        this.orgInactive = this.org.filter(function(value){
          return value.active == false;
        })
        this.org2 = this.orgInactive
        this.checked=true;
      }
      else{
        this.orgActive = this.org.filter(function(value){
          return value.active == true;
        })
        this.org2 = this.orgActive
        this.checked=false;
      }
  }
  observable = new Observable();
  showData2(){
    this.organisationService.getListOrganisation().subscribe(value => this.org2 = this.org.filter(function(value){
      return value.active==true;
    }))
    // this.org2 = this.org.filter(function(value){
    //   return value.active==true;
    // })
    console.log(this.org)
    console.log(this.org2);
  }
  isDiplay:boolean = false;
  isDiplayList: boolean = true;

  isDisplayButton: boolean = true;
  constructor(private fb:FormBuilder,
    private organisationService:OrganisationService,
    private router:Router,
    private activatedRoute: ActivatedRoute) { } 

  ngOnInit(): void {
    
    this.getListOrg();
    
    this.showData();
    this.showData2();
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
