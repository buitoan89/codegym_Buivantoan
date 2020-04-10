import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AngularCountdownTimerAliasComponent } from './angular-countdown-timer-alias.component';

describe('AngularCountdownTimerAliasComponent', () => {
  let component: AngularCountdownTimerAliasComponent;
  let fixture: ComponentFixture<AngularCountdownTimerAliasComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AngularCountdownTimerAliasComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AngularCountdownTimerAliasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
