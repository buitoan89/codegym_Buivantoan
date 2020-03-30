import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TonghopEditComponent } from './tonghop-edit.component';

describe('TonghopEditComponent', () => {
  let component: TonghopEditComponent;
  let fixture: ComponentFixture<TonghopEditComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TonghopEditComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TonghopEditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
