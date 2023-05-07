import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MessengerTextboxComponent } from './messenger-textbox.component';

describe('MessengerTextboxComponent', () => {
  let component: MessengerTextboxComponent;
  let fixture: ComponentFixture<MessengerTextboxComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [MessengerTextboxComponent]
    });
    fixture = TestBed.createComponent(MessengerTextboxComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
