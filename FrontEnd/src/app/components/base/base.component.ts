import { Component } from '@angular/core';
import { faGhost } from '@fortawesome/free-solid-svg-icons';
import { RootLevelService } from 'src/services/root-level.service';
import { User } from '../../interfaces';
import { authConfig } from 'src/app/auth.config';
import { JwksValidationHandler, OAuthService } from 'angular-oauth2-oidc';
//import { JwksValidationHandler, OAuthService } from 'angular-oauth2-oidc';
//import { authConfig } from 'src/app/auth.config';

@Component({
  selector: 'app-base',
  templateUrl: './base.component.html',
  styleUrls: ['./base.component.scss']
})
export  class BaseComponent {
  faGhost = faGhost;
  

  constructor(private oauthService: OAuthService) {
    this.configure();
  }

  private configure() {
    this.oauthService.configure(authConfig);
    this.oauthService.tokenValidationHandler = new JwksValidationHandler();
    this.oauthService.loadDiscoveryDocumentAndTryLogin();
  }
  get isLoggedIn() {
    return !!this.oauthService.getIdToken();
  }
  
  handleLoginClick = () => this.isLoggedIn 
    ? this.oauthService.logOut()
    : this.oauthService.initLoginFlow();
}