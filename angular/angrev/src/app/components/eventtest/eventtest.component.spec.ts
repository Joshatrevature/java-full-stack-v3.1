import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EventtestComponent } from './eventtest.component';

describe('EventtestComponent', () => {
  let component: EventtestComponent;
  let fixture: ComponentFixture<EventtestComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EventtestComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EventtestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
