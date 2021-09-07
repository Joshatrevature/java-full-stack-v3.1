import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NgtracktestComponent } from './ngtracktest.component';

describe('NgtracktestComponent', () => {
  let component: NgtracktestComponent;
  let fixture: ComponentFixture<NgtracktestComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NgtracktestComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NgtracktestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
