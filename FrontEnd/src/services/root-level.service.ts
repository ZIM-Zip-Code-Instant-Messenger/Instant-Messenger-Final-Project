import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Chat as GroupChat, User, Message } from '../app/interfaces';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class RootLevelService {

  baseUrl = "http://localhost:8080";

  constructor(private http: HttpClient) { }


  updateChat(message: Message, chatId: any): Observable<Object> {
    return this.http.put(this.baseUrl + "/chats/message/" + `${chatId}`, message);
  }

  getChatById(chatId: any) {
    return this.http.get<GroupChat>(this.baseUrl + "/chats/" + chatId)
  }

  addMessageToChatRoom(message: Message): Observable<Object> {
    return this.http.post(this.baseUrl + "/chats/add/message1", message);
  }

  getAllMessagesByChatId(chatId: any) {
    return this.http.get<Message[]>(this.baseUrl + "/chats/all/messages/from/chat/" + chatId)
  }

  createChatRoom(chat: GroupChat): Observable<Object> {
    return this.http.post(this.baseUrl + "/chats/add", chat);
  }

  getChatByFirstUserNameAndSecondUserName(firstUserName: String, secondUserName: String) {
    return this.http.get<GroupChat>(this.baseUrl + "/chats/getChatByFirstUserNameAndSecondUserName" + '?firstUserName=' + firstUserName + '&secondUserName=' + secondUserName)
  }

  getChatByFirstUserNameOrSecondUserName(username: any) {
    return this.http.get<GroupChat>(this.baseUrl + "/chats/getChatByFirstUserNameOrSecondUserName/" + username)
  }






  getActiveUsers(): Observable<User[]> {
    return this.http.get<User[]>(this.baseUrl + "usercontroller/getall/")
  }

  postUser(user: User): Observable<void> {
    return this.http.post<void> (this.baseUrl + "usercontroller/add/", user)
  }

  getByUserName(username: string): Observable<User>{
    return this.http.get<User> (this.baseUrl + "usercontroller/getbyusername/" + username)
  }


}
