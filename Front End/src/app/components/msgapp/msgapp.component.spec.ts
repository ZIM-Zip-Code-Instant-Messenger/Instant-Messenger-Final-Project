import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MsgappComponent } from './msgapp.component';

describe('MsgappComponent', () => {
  let component: MsgappComponent;
  let fixture: ComponentFixture<MsgappComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MsgappComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MsgappComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
