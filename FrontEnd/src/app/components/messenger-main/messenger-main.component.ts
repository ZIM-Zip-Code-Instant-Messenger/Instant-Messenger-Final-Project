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

}
