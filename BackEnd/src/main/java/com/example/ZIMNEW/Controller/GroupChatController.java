
package com.example.ZIMNEW.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ZIMNEW.Model.GroupChat;
import com.example.ZIMNEW.Service.GroupChatService;

@RestController
@RequestMapping("/chat")
public class GroupChatController {
    @Autowired
    private GroupChatService service;

    public GroupChatController(GroupChatService service) {
        this.service = service;
    }

    @GetMapping("")
    public ResponseEntity<Iterable<GroupChat>> index() {
        return new ResponseEntity<>(service.index(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GroupChat> show(@PathVariable Long id) {
        return new ResponseEntity<>(service.show(id), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<GroupChat> create(@RequestBody GroupChat groupchat) {
        return new ResponseEntity<>(service.create(groupchat), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GroupChat> update(@PathVariable("id") Long id, @RequestBody GroupChat groupchat) {
        return new ResponseEntity<>(service.update(id, groupchat), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> destroy(@PathVariable("id") Long id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }

}
