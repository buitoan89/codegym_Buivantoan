import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FontSizeEditComponent } from './font-size-edit.component';

describe('FontSizeEditComponent', () => {
  let component: FontSizeEditComponent;
  let fixture: ComponentFixture<FontSizeEditComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FontSizeEditComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FontSizeEditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
