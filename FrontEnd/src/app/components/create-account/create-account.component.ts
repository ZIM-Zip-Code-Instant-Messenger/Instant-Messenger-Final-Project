import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-create-account',
  templateUrl: './create-account.component.html',
  styleUrls: ['./create-account.component.scss']
})
export class CreateAccountComponent {

  user = {
    username: '',
    password: ''
  };

  constructor(){ }

  onSubmit(form: NgForm){
    if (form.valid){
      //handle form submission here
      console.log('Form submitted:', this.user);
    }
  }
}
