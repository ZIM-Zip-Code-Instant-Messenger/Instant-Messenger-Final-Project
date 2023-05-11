package com.example.ZIMNEW.Service;

import org.springframework.stereotype.Service;

import com.example.ZIMNEW.Model.GroupChat;
import com.example.ZIMNEW.Repository.GroupChatRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class GroupChatService {
    @Autowired
    private GroupChatRepository repository;

    public GroupChatService(GroupChatRepository repository) {
        this.repository = repository;
    }

    public Iterable<GroupChat> index() {
        return repository.findAll();
    }

    public GroupChat show(Long id) {
        return repository.findById(id).get();
    }

    public GroupChat create(GroupChat employee) {
        return repository.save(employee);
    }

    public GroupChat update(Long id, GroupChat employee) {
        GroupChat originalChat = repository.findById(id).get();
        originalChat.setName(employee.getName());
        return repository.save(originalChat);
    }

    public Boolean delete(Long id) {
        repository.deleteById(id);
        return true;
    }
}