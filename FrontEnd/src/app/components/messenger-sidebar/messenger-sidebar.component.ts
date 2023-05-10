import { Component } from '@angular/core';

@Component({
  selector: 'app-messenger-sidebar',
  templateUrl: './messenger-sidebar.component.html',
  styleUrls: ['./messenger-sidebar.component.scss']
})
export class MessengerSidebarComponent {
chats: string[] = ["Colin", "Zach", "Hiep", "Andre"]; //creating a chats array
addChat(){
  this.chats.push("Heip") //need an input box to define new chat
}

removeChat(chatToBeRemoved: string){
  const index: number = this.chats.findIndex((chat: string) => chat===chatToBeRemoved);
  this.chats.splice(index,1);
}

openTextBox(chat: string){

}
}
