import { Component } from '@angular/core';
import { faGhost } from '@fortawesome/free-solid-svg-icons';
import { NgForm } from '@angular/forms';


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
constructor(){ }
onSubmit(form: NgForm){
  if (form.valid){
    //Handle form submission here
    console.log('Form submitted:', this.user)
  }
}
}
