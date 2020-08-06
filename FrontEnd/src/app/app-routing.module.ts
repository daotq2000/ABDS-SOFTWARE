import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LayoutComponent } from './layout/layout.component';
import { pathToFileURL } from 'url';
import { FormOrganisationComponent } from './form-organisation/form-organisation.component';
import { ForServiceComponent } from './for-service/for-service.component';
import { ProgrammeComponent } from './programme/programme.component';
import { OrganisationListComponent } from './organisation-list/organisation-list.component';
import { OrganisationCnpComponent } from './organisation-cnp/organisation-cnp.component';
import { ProgrammeFormComponent } from './programme-form/programme-form.component';
import { ProgrammeListComponent } from './programme-list/programme-list.component';
import { ServiceComponent } from './service/service.component';
import { ServiceListComponent } from './service-list/service-list.component';
import { AddressComponent } from './address/address.component';
import { AddressFormComponent } from './address-form/address-form.component';
import { AddressListComponent } from './address-list/address-list.component';

const routes: Routes = [

  {
    path: '',
    component: LayoutComponent,
    children: [
      {
        path: '',
        component: OrganisationCnpComponent,
        children: [
          {
            path: 'org-list',
            component: FormOrganisationComponent
          },
          {
            path: 'org-form',
            component: OrganisationListComponent
          },
          {
            path: 'org-form/:id',
            component: OrganisationListComponent
          },
          {
            path: '',
            redirectTo : 'org-list',
            pathMatch: 'full'
          }
        ]
      },
      {
        path: '',
        component: ProgrammeComponent,
        children: [
          {
            path: 'form-pg',
            component: ProgrammeFormComponent
          },
          {
            path: 'form-pg/:id',
            component: ProgrammeFormComponent
          },
          {
            path: 'list-pg',
            component: ProgrammeListComponent
          }
        ]
      },
      {
        path: '',
        component: ServiceComponent,
        children: [
          {
            path: 'form-sv',
            component: ForServiceComponent
          },
          {
            path: 'list-sv',
            component: ServiceListComponent
          }
        ]
      },
      {
        path: '',
        component: AddressComponent,
        children: [
          {
            path: 'form-ad',
            component: AddressFormComponent
          },
          {
            path: 'list-ad',
            component: AddressListComponent
          }
        ]
      }
    ]
  },

];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
