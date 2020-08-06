import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { OrganisationCnpComponent } from './organisation-cnp.component';

describe('OrganisationCnpComponent', () => {
  let component: OrganisationCnpComponent;
  let fixture: ComponentFixture<OrganisationCnpComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ OrganisationCnpComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OrganisationCnpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
