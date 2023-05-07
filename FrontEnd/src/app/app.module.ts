import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { LoginComponent } from './components/login/login.component';
import { BaseComponent } from 'src/app/components/base/base.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { RoutingModule } from './app.router.module';
import { MessengerMainComponent } from 'src/app/components/messenger-main/messenger-main.component';
import { MessengerSidebarComponent } from 'src/app/components/messenger-sidebar/messenger-sidebar.component';
import { MessengerTextboxComponent } from 'src/app/components/messenger-textbox/messenger-textbox.component';



@NgModule({
  declarations: [
      LoginComponent,
      MessengerMainComponent,
      MessengerSidebarComponent,
      MessengerTextboxComponent
  ],
  imports: [
    BrowserModule,
    FontAwesomeModule,
    RoutingModule
  ],
  providers: [],
  bootstrap: [BaseComponent]
})
export class AppModule { }
