import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NgswitchtestComponent } from './ngswitchtest.component';

describe('NgswitchtestComponent', () => {
  let component: NgswitchtestComponent;
  let fixture: ComponentFixture<NgswitchtestComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NgswitchtestComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NgswitchtestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
