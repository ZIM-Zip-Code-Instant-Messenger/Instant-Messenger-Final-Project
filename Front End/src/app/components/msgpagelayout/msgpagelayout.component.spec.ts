import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MsgpagelayoutComponent } from './msgpagelayout.component';

describe('MsgpagelayoutComponent', () => {
  let component: MsgpagelayoutComponent;
  let fixture: ComponentFixture<MsgpagelayoutComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MsgpagelayoutComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MsgpagelayoutComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
