import { Component } from '@angular/core';
import { faGhost } from '@fortawesome/free-solid-svg-icons';
import { RootLevelService } from 'src/services/root-level.service';
import { User } from '../../interfaces';

@Component({
  selector: 'app-base',
  templateUrl: './base.component.html',
  styleUrls: ['./base.component.scss']
})
export class BaseComponent {
  faGhost = faGhost;

constructor(public httpService: RootLevelService){}

//on initialize
  ngOnInit(){
    this.httpService.getActiveUsers().subscribe((users: User[]) => {
      this.httpService.usersList = users;
    });
  }

  
}
