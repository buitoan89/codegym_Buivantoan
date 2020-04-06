import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { InpuoutputComponent } from './inpuoutput.component';

describe('InpuoutputComponent', () => {
  let component: InpuoutputComponent;
  let fixture: ComponentFixture<InpuoutputComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InpuoutputComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(InpuoutputComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
