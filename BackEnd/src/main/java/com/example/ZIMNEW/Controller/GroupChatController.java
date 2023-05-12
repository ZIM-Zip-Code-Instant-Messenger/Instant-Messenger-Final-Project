
package com.example.ZIMNEW.Controller;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ZIMNEW.Model.GroupChat;
import com.example.ZIMNEW.Model.Message;
import com.example.ZIMNEW.Service.GroupChatService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/chat")
public class GroupChatController {
    @Autowired
    private GroupChatService service;

    public GroupChatController(GroupChatService service) {
        this.service = service;
        
    }

    @PostMapping("/add")
    public ResponseEntity<GroupChat> createChat(@RequestBody GroupChat groupchat) throws IOException {
        try {
    return new ResponseEntity<>(service.create(groupchat), HttpStatus.CREATED);
        }catch (ChatAlreadyExistException e) {
            return new ResponseEntity(body: "Chat already exists", HttpStatus.CONFLICT);
        }
    }

    @PostMapping("/create/message1")
    public ResponseEntity<Message> addMessage2(@RequestBody Message message) throws IOException {
        return new ResponseEntity<Message>(service.addMessage2(message), HttpStatus.CREATED)
    }

    @GetMapping("/all")
    public ResponseEntity<List<GroupChat>> getEveryChat() {
        try {
            return new ResponseEntity<List<GroupChat>>(service.findEveryChat(), HttpStatus.OK);
        }catch (NoChatExists e) {
            return new ResponseEntity(body: "No chats exist", HttpStatus.CONFLICT);
        }
    }

    @GetMapping("/all/messages/from/chat/{chatid}")
    public ResponseEntity<?> getAllMessagesInChat(@PathVariable Long id) {
        try {
            GroupChat chat = new GroupChat();
            chat.setId(id);
            List<Message> messageList = this.service.getAllMessagesInChat(id);
            return ResponseEntity.ok(messageList);
        } catch (NoChatExists e) {
            return new ResponseEntity(body: "No chats exist", HttpStatus.CONFLICT);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<GroupChat> getChatById(@PathVariable Long id){
        try{
            return new ResponseEntity<GroupChat>(service.getById(id), HttpStatus.OK);
        } catch (ChatNotFoundException e) {
            return new ResponseEntity("Chat Not Found", HttpStatus.NOT_FOUND)
        }
    }

    @GetMapping("/firstUserName/{username}")
    public ResponseEntity<?> getChatByFirstUser(@PathVariable String userName){
        try {
            HashSet<GroupChat> chat = this.service.getChatByFirstUser(userName);
            return new ResponseEntity<>(chat, HttpStatus.OK);
        } catch (ChatNotFoundException e) {
            return new ResponseEntity("Chat Not Found", HttpStatus.NOT_FOUND)
        }
    }

    @GetMapping("/secondUserName/{username}")
    public ResponseEntity<?> getChatBySecondUser(@PathVariable String userName){
        try {
            HashSet<GroupChat> chat = this.service.getChatBySecondUser(userName);
            return new ResponseEntity<>(chat, HttpStatus.OK);
        } catch (ChatNotFoundException e) {
            return new ResponseEntity("Chat Not Found", HttpStatus.NOT_FOUND)
        }
    }

    @GetMapping("/getChatByFirstUserNameOrSecondUserName/{username}")
    public ResponseEntity<?> getChatByFirstUserNameOrSecondUserName(@PathVariable String username) {

        try {
            HashSet<GroupChat> chat = this.service.getChatByFirstUserNameOrSecondUserName(username);
            return new ResponseEntity<>(chat, HttpStatus.OK);
        } catch (ChatNotFoundException e) {
            return new ResponseEntity("Chat Not Exits", HttpStatus.CONFLICT);

    }
}


    @GetMapping("/getChatByFirstUserNameAndSecondUserName")
    public ResponseEntity<?> getChatByFirstUserNameAndSecondUserName(@RequestParam("firstUserName") String firstUserName, @RequestParam("secondUserName") String secondUserName){

        try {
            HashSet<GroupChat> chatByBothEmail = this.service.getChatByFirstUserNameAndSecondUserName(firstUserName, secondUserName);
            return new ResponseEntity<>(chatByBothEmail, HttpStatus.OK);
        } catch (ChatNotFoundException e) {
            return new ResponseEntity("Chat Not Exits", HttpStatus.NOT_FOUND);
        }
    }


    @PutMapping("/message/{chatId}")
    public ResponseEntity<GroupChat> addMessage(@RequestBody Message add , @PathVariable int chatId) throws ChatNotFoundException {
        return new ResponseEntity<GroupChat>(service.addMessage(add,chatId), HttpStatus.OK);
    }

    }