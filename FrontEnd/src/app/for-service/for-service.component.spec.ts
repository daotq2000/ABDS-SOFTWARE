import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ForServiceComponent } from './for-service.component';

describe('ForServiceComponent', () => {
  let component: ForServiceComponent;
  let fixture: ComponentFixture<ForServiceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ForServiceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ForServiceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
