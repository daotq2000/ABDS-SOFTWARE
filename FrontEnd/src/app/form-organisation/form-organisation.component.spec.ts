import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FormOrganisationComponent } from './form-organisation.component';

describe('FormOrganisationComponent', () => {
  let component: FormOrganisationComponent;
  let fixture: ComponentFixture<FormOrganisationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FormOrganisationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FormOrganisationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
