package com.example.ZIMNEW.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ZIMNEW.Model.Message;
import com.example.ZIMNEW.Repository.MessageRepository;

@Service
public class MessageService {
    @Autowired
    private MessageRepository repository;

    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

    public Iterable<Message> index() {
        return repository.findAll();
    }

    public Message show(Long id) {
        return repository.findById(id).get();
    }

    public Message create(Message message) {
        return repository.save(message);
    }

    public Message update(Long id, Message message) {
        Message originalMessage = repository.findById(id).get();
        originalMessage.setMessage(message.getMessage());
        return repository.save(originalMessage);
    }

    public Boolean delete(Long id) {
        repository.deleteById(id);
        return true;
    }
}
