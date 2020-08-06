import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators, FormControl, FormGroup } from '@angular/forms';
import { ServiceService } from '../service.service';
import { Service } from '../bean/Service';

@Component({
  selector: 'app-service-list',
  templateUrl: './service-list.component.html',
  styleUrls: ['./service-list.component.css']
})
export class ServiceListComponent implements OnInit {

  isDiplay:boolean = false;
  isDiplayList: boolean = true;
  isDisplayButton: boolean = true;

  change(){
    this.isDiplay=true;
    this.isDisplayButton = false;
    this.isDiplayList= false;
  }

  
  constructor(private fb:FormBuilder,
    private serviceService: ServiceService) { } 

  ngOnInit(): void {
    this.getListSevice();


    this.validateForm = this.fb.group({
      email: [null, [Validators.email, Validators.required]],
      password: [null, [Validators.required]],
      checkPassword: [null, [Validators.required, this.confirmationValidator]],
      nickname: [null, [Validators.required]],
      phoneNumberPrefix: ['+86'],
      phoneNumber: [null, [Validators.required]],
      website: [null, [Validators.required]],
      captcha: [null, [Validators.required]],
    });
  }
  confirmationValidator = (control: FormControl): { [s: string]: boolean } => {
    if (!control.value) {
      return { required: true };
    } else if (control.value !== this.validateForm.controls.password.value) {
      return { confirm: true, error: true };
    }
    return {};
  };

  updateConfirmValidator(): void {
    /** wait for refresh value */
    Promise.resolve().then(() => this.validateForm.controls.checkPassword.updateValueAndValidity());
  }

  getCaptcha(e: MouseEvent): void {
    e.preventDefault();
  }

  // closeTab(tab: string):void {
  //   this.tabs.splice(this.tabs.indexOf(tab), 1)
  // }

  validateForm!: FormGroup;

  submitForm(): void {
    for (const i in this.validateForm.controls) {
      this.validateForm.controls[i].markAsDirty();
      this.validateForm.controls[i].updateValueAndValidity();
    }
  }



  valueYear: number = 1800

  service: Service[] = [];

  getListSevice(){
    this.serviceService.getListService().subscribe(data=>{
        this.service = data;
        console.log(data);
    })
  }
}
