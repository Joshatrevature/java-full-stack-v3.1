import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NgfortestComponent } from './ngfortest.component';

describe('NgfortestComponent', () => {
  let component: NgfortestComponent;
  let fixture: ComponentFixture<NgfortestComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NgfortestComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NgfortestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
