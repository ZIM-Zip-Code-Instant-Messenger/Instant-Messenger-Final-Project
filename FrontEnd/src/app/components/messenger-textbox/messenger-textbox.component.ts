import { Component } from '@angular/core';

@Component({
  selector: 'app-messenger-textbox',
  templateUrl: './messenger-textbox.component.html',
  styleUrls: ['./messenger-textbox.component.scss']
})
export class MessengerTextboxComponent {
  messages: string[] = [];

  constructor() { }

  sendMesseage(message: string) {
    if (message.trim()){
      this.messages.push(message)
    }
  }

}
