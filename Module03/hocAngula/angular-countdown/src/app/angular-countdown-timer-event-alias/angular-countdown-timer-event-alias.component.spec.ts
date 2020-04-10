import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AngularCountdownTimerEventAliasComponent } from './angular-countdown-timer-event-alias.component';

describe('AngularCountdownTimerEventAliasComponent', () => {
  let component: AngularCountdownTimerEventAliasComponent;
  let fixture: ComponentFixture<AngularCountdownTimerEventAliasComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AngularCountdownTimerEventAliasComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AngularCountdownTimerEventAliasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
