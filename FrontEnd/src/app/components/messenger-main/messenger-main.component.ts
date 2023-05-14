import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { faGhost } from '@fortawesome/free-solid-svg-icons';



@Component({
  selector: 'app-messenger-main',
  templateUrl: './messenger-main.component.html',
  styleUrls: ['./messenger-main.component.scss']
})
export class MessengerMainComponent {
  faGhost = faGhost;

  constructor(private router: Router) {}

  chooseUsername() {
    const username = prompt('Enter your username'); // Prompt the user to enter a username
    if (username) {
      // Perform any validation or checks if required

      // Navigate to the messenger sidebar component and pass the chosen username as a query parameter
      this.router.navigate(['/messenger-main'], { queryParams: { username } });
    }
  }
}
