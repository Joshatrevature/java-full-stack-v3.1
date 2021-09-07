import { ComponentFixture, TestBed } from '@angular/core/testing';

import { interpoltest } from './interpoltest.component';

describe('interpoltest', () => {
  let component: interpoltest;
  let fixture: ComponentFixture<interpoltest>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ interpoltest ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(interpoltest);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
