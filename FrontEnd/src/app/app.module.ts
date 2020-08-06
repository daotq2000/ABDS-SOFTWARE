import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { IconsProviderModule } from './icons-provider.module';
import { NzLayoutModule } from 'ng-zorro-antd/layout';
import { NzMenuModule } from 'ng-zorro-antd/menu';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NZ_I18N } from 'ng-zorro-antd/i18n';
import { en_US } from 'ng-zorro-antd/i18n';
import { registerLocaleData } from '@angular/common';
// import en from '@angular/common/locales/en';
import { DemoNgZorroAntdModule } from "./ng-zorro-antd.module";


import { LayoutComponent } from './layout/layout.component';
import { FormOrganisationComponent } from './form-organisation/form-organisation.component';
import { ForServiceComponent } from './for-service/for-service.component';
import { ProgrammeComponent } from './programme/programme.component';
import { OrganisationListComponent } from './organisation-list/organisation-list.component';
import { OrganisationCnpComponent } from './organisation-cnp/organisation-cnp.component';
import { ProgrammeFormComponent } from './programme-form/programme-form.component';
import { ProgrammeListComponent } from './programme-list/programme-list.component';
import { ServiceComponent } from './service/service.component';
import { ServiceListComponent } from './service-list/service-list.component';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { AddressComponent } from './address/address.component';
import { AddressFormComponent } from './address-form/address-form.component';
import { AddressListComponent } from './address-list/address-list.component';

// registerLocaleData(en);

@NgModule({
  declarations: [
    AppComponent,
    LayoutComponent,
    FormOrganisationComponent,
    ForServiceComponent,
    ProgrammeComponent,
    OrganisationListComponent,
    OrganisationCnpComponent,
    ProgrammeFormComponent,
    ProgrammeListComponent,
    ServiceComponent,
    ServiceListComponent,
    AddressComponent,
    AddressFormComponent,
    AddressListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    IconsProviderModule,
    NzLayoutModule,
    NzMenuModule,
    ReactiveFormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    DemoNgZorroAntdModule,
    Ng2SearchPipeModule
  ],
  providers: [{ provide: NZ_I18N, useValue: en_US }],
  bootstrap: [AppComponent]
})
export class AppModule { }
