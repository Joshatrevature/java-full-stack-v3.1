import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NgiftestComponent } from './ngiftest.component';

describe('NgiftestComponent', () => {
  let component: NgiftestComponent;
  let fixture: ComponentFixture<NgiftestComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NgiftestComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NgiftestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
