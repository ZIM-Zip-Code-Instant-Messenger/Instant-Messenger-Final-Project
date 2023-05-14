import { Component } from '@angular/core';
import { faGhost } from '@fortawesome/free-solid-svg-icons';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { JwksValidationHandler, OAuthService } from 'angular-oauth2-oidc';
import { authConfig } from 'src/app/auth.config';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent {
faGhost = faGhost;
user = {
  username: '',
  password: ''
};
constructor(private router: Router, private oauthService: OAuthService) {
  this.configure();
}
onSubmit(form: NgForm){
  if (form.valid){
    //Handle form submission here
    console.log('Form submitted:', this.user)

    //sends users to messenger main path when successful login. still need to add login validation
    this.router.navigate(['/messenger-main']); 

    //need method to validate user and then send to Spring
  }
}

private configure() {
  this.oauthService.configure(authConfig);
  this.oauthService.tokenValidationHandler = new JwksValidationHandler();
  this.oauthService.loadDiscoveryDocumentAndTryLogin();
}
get isLoggedIn() {
  return !!this.oauthService.getIdToken();
}

handleLoginClick(){
  if(this.isLoggedIn){
     this.oauthService.logOut()
     this.router.navigate(['/']);
  } else {
    this.oauthService.initLoginFlow();
    this.router.navigate(['/messenger-main']); 
  }
 }
}