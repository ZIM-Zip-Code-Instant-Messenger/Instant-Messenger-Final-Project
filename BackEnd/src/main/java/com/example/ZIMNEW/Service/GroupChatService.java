package com.example.ZIMNEW.Service;

import org.springframework.stereotype.Service;

import com.example.ZIMNEW.Model.GroupChat;
import com.example.ZIMNEW.Model.Message;
import com.example.ZIMNEW.Repository.GroupChatRepository;

import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class GroupChatService {
    @Autowired
    private GroupChatRepository repository;

    public GroupChatService(GroupChatRepository repository) {
        this.repository = repository;
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

    public List<GroupChat> findEveryChat() {
        return null;
    }


    public GroupChat getById(Long id) {
        return null;
    }


    public List<Message> getAllMessagesInChat(Long id) {
        return null;
    }


    public HashSet<GroupChat> getChatByFirstUser(String userName) {
        return null;
    }

    public HashSet<GroupChat> getChatBySecondUser(String userName) {
        return null;
    }


    public HashSet<GroupChat> getChatByFirstUserNameOrSecondUserName(String username) {
        return null;
    }


    public HashSet<GroupChat> getChatByFirstUserNameAndSecondUserName(String firstUserName, String secondUserName) {
        return null;
    }
}