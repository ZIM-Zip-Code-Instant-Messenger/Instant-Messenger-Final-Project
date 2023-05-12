export interface Chat { 
    chatId: number;
    chatFirstUserName: string;
    chatSecondUserName: string;
    chatList: Message[];

 }

 export interface Message{
    chatMessage: string;
    chatSenderEmail: string;
    chatReplyMessage: string;
    chatTime: Date;
 }

 export interface User {
    userUserName: string;

 }
