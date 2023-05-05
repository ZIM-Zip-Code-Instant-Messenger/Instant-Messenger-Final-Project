import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MsgsidebarComponent } from './msgsidebar.component';

describe('MsgsidebarComponent', () => {
  let component: MsgsidebarComponent;
  let fixture: ComponentFixture<MsgsidebarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MsgsidebarComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MsgsidebarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
