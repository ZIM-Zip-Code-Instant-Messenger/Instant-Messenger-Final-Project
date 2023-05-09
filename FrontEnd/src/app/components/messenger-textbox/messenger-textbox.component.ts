import { Component } from '@angular/core';
import { RootLevelService } from 'src/services/root-level.service';

@Component({
  selector: 'app-messenger-textbox',
  templateUrl: './messenger-textbox.component.html',
  styleUrls: ['./messenger-textbox.component.scss']
})
export class MessengerTextboxComponent {
  messages: string[] = [];

  constructor(private rootLevelService: RootLevelService) { }

  ngOnInit(): void {
    const apiUrl = 'https://api.example.com/data'; // Replace with your API URL
    this.rootLevelService.getData(apiUrl).subscribe(
      data => {
        console.log('API data:', data);
      },
      error => {
        console.error('Error fetching data:', error);
      }
    );
  }
  

  sendMessage(message: string) {
    if (message.trim()){
      this.messages.push(message)
    }
  }

}
