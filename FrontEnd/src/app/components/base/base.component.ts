import { Component } from '@angular/core';
import { faGhost } from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-base',
  templateUrl: './base.component.html',
  styleUrls: ['./base.component.scss']
})
export class BaseComponent {
  faGhost = faGhost;
}
