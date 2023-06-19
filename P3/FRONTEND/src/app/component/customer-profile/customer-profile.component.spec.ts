import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ContractorProfileComponent } from './customer-profile.component';

describe('CustomerProfileComponent', () => {
  let component: ContractorProfileComponent;
  let fixture: ComponentFixture<ContractorProfileComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ContractorProfileComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ContractorProfileComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
