package com.example.ZIMNEW.Chat;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ChatService {
    @Autowired
    private ChatRepository repository;

    public ChatService(ChatRepository repository) {
        this.repository = repository;
    }

    public Iterable<Chat> index() {
        return repository.findAll();
    }

    public Chat show(Long id) {
        return repository.findById(id).get();
    }

    public Chat create(Chat employee) {
        return repository.save(employee);
    }

    public Chat update(Long id, Chat employee) {
        Chat originalChat = repository.findById(id).get();
        originalChat.setName(employee.getName());
        return repository.save(originalChat);
    }

    public Boolean delete(Long id) {
        repository.deleteById(id);
        return true;
    }
}