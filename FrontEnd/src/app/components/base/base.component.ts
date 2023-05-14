import { Component } from '@angular/core';
import { faGhost } from '@fortawesome/free-solid-svg-icons';

//import { JwksValidationHandler, OAuthService } from 'angular-oauth2-oidc';
//import { authConfig } from 'src/app/auth.config';

@Component({
  selector: 'app-base',
  templateUrl: './base.component.html',
  styleUrls: ['./base.component.scss']
})
export  class BaseComponent {
  faGhost = faGhost;
  
}