import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Chat, User, Message } from '../app/interfaces';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class RootLevelService {

  baseUrl = "http://localhost:51374" //Backend base url

  usersList: User[] | undefined;

  constructor(private http: HttpClient) { }

  addChat(chat: Chat): Observable<void> {
    return this.http.post<void>(this.baseUrl + "/chatcontroller/add", chat); //post requests take 2 params
  }

  getAllUserChats(): Observable<Chat[]>{
    return this.http.get<Chat[]>(this.baseUrl + "/chatcontroller/all")
  }

  getChatById(id: number): Observable<Chat>{
    return this.http.get<Chat>(this.baseUrl + "/chatcontroller/" + id)
  }

  getChatByFirstUser(username: string): Observable<{[key:string]: Chat}> {
    return this.http.get<{[key:string]: Chat}> (this.baseUrl + "/chatcontroller/firstUserName/" + username)
  }

  getChatBySecondUser(username: string): Observable<{[key:string]: Chat}> {
    return this.http.get<{[key:string]: Chat}> (this.baseUrl + "/chatcontroller/secondUserName/" + username)
  }

  getChatByFirstOrSecondUser(username: string): Observable<{[key:string]: Chat}> {
    return this.http.get<{[key:string]: Chat}> (this.baseUrl + "/chatcontroller/getChatByFirstUserNameOrSecondUserName/" + username)
  }

  getChatByFirstAndSecondUser(firstUserName: string, secondUserName: string): Observable<{[key:string]: Chat}> {
    return this.http.get<{[key:string]: Chat}> (this.baseUrl + "/chatcontroller/getChatByFirstUserNameAndSecondUserName?=firstUserName=" + firstUserName + "&secondUserName=" + secondUserName)
  }

  putMessage(chat: Chat): Observable<Chat> {
    return this.http.put<Chat>(this.baseUrl + "/chatcontroller/message/", chat);
  }







  getActiveUsers(): Observable<User[]> {
    return this.http.get<User[]>(this.baseUrl + "usercontroller/getallusers/")
  }

  postUser(user: User): Observable<void> {
    return this.http.post<void> (this.baseUrl + "usercontroller/add", user)
  }

  getByUserName(username: string): Observable<User>{
    return this.http.get<User> (this.baseUrl + "usercontroller/getbyusername/" + username)
  }
}
