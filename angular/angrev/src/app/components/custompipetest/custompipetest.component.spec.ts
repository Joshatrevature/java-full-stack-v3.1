import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CustompipetestComponent } from './custompipetest.component';

describe('CustompipetestComponent', () => {
  let component: CustompipetestComponent;
  let fixture: ComponentFixture<CustompipetestComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CustompipetestComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CustompipetestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
