
package com.example.ZIMNEW.Chat;

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

@RestController
@RequestMapping("/chat")
public class ChatController {
    @Autowired
    private ChatService service;

    public ChatController(ChatService service) {
        this.service = service;
    }

    @GetMapping("")
    public ResponseEntity<Iterable<Chat>> index() {
        return new ResponseEntity<>(service.index(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Chat> show(@PathVariable Long id) {
        return new ResponseEntity<>(service.show(id), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Chat> create(@RequestBody Chat employee) {
        return new ResponseEntity<>(service.create(employee), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Chat> update(@PathVariable("id") Long id, @RequestBody Chat employee) {
        return new ResponseEntity<>(service.update(id, employee), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> destroy(@PathVariable("id") Long id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }

}
