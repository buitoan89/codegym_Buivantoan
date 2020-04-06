import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CountdownTimeSetGetComponent } from './countdown-time-set-get.component';

describe('CountdownTimeSetGetComponent', () => {
  let component: CountdownTimeSetGetComponent;
  let fixture: ComponentFixture<CountdownTimeSetGetComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CountdownTimeSetGetComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CountdownTimeSetGetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
