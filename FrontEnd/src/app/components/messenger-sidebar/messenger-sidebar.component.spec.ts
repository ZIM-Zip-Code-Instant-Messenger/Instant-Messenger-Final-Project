import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MessengerSidebarComponent } from './messenger-sidebar.component';

describe('MessengerSidebarComponent', () => {
  let component: MessengerSidebarComponent;
  let fixture: ComponentFixture<MessengerSidebarComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [MessengerSidebarComponent]
    });
    fixture = TestBed.createComponent(MessengerSidebarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
