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

import com.example.ZIMNEW.Model.Message;
import com.example.ZIMNEW.Service.MessageService;

@RestController
@RequestMapping("/message")
public class MessageController {
    @Autowired
    private MessageService service;

    public MessageController(MessageService service) {
        this.service = service;
    }

    @GetMapping("")
    public ResponseEntity<Iterable<Message>> index() {
        return new ResponseEntity<>(service.index(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Message> show(@PathVariable Long id) {
        return new ResponseEntity<>(service.show(id), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Message> create(@RequestBody Message message) {
        return new ResponseEntity<>(service.create(message), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Message> update(@PathVariable("id") Long id, @RequestBody Message message) {
        return new ResponseEntity<>(service.update(id, message), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> destroy(@PathVariable("id") Long id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }

}