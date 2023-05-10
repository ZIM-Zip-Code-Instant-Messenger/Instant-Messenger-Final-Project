import { Component} from '@angular/core';
import { faGhost } from '@fortawesome/free-solid-svg-icons';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';





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
constructor(private router: Router){ }
onSubmit(form: NgForm){
  if (form.valid){
    //Handle form submission here
    console.log('Form submitted:', this.user)

    //sends users to messenger main path when successful login. still need to add login validation
    this.router.navigate(['/messenger-main']); 
  }
}
}
