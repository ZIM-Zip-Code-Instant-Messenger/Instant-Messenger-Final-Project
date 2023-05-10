
import { CUSTOM_ELEMENTS_SCHEMA, NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { LoginComponent } from './components/login/login.component';
import { BaseComponent } from 'src/app/components/base/base.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { RoutingModule } from './app.router.module';
import { MessengerMainComponent } from 'src/app/components/messenger-main/messenger-main.component';
import { MessengerSidebarComponent } from 'src/app/components/messenger-sidebar/messenger-sidebar.component';
import { MessengerTextboxComponent } from 'src/app/components/messenger-textbox/messenger-textbox.component';
import { FormsModule } from '@angular/forms';
import { NavbarComponent } from './navbar/navbar.component';


import { CreateAccountComponent } from './components/create-account/create-account.component';
import { MatToolbarModule } from '@angular/material/toolbar';
import { HttpClientModule } from '@angular/common/http';
import { RootLevelService } from 'src/services/root-level.service';

import { SocialLoginModule, SocialAuthServiceConfig } from '@abacritt/angularx-social-login';
import {
  GoogleLoginProvider,
  FacebookLoginProvider
} from '@abacritt/angularx-social-login';


@NgModule({
  declarations: [
      LoginComponent,
      MessengerMainComponent,
      MessengerSidebarComponent,
      BaseComponent,
      CreateAccountComponent,
      MessengerTextboxComponent
      
  ],
  imports: [
    BrowserModule,
    FontAwesomeModule,
    RoutingModule,
    FormsModule,
    MatToolbarModule,
    HttpClientModule,
    SocialLoginModule
    
    ],
  providers: [
    RootLevelService,
    {
      provide: 'SocialAuthServiceConfig',
      useValue: {
        autoLogin: false,
        providers: [
          {
            id: GoogleLoginProvider.PROVIDER_ID,
            provider: new GoogleLoginProvider(
              'clientId'
            )
          },
          {
            id: FacebookLoginProvider.PROVIDER_ID,
            provider: new FacebookLoginProvider('clientId')
          }
        ],
        onError: (err) => {
          console.error(err);
        }
      } as SocialAuthServiceConfig,

    }
  ],
    
  bootstrap: [BaseComponent] 
})
export class AppModule {
 }


