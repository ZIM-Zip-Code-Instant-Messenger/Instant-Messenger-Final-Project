package com.example.ZIMNEW.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ZIMNEW.Model.GroupChat;
import com.example.ZIMNEW.Model.Message;
import com.example.ZIMNEW.Repository.GroupChatRepository;
import com.example.ZIMNEW.Repository.MessageRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

@Service
public class GroupChatServicelmpl implements GroupChatService {

    @Autowired
    private GroupChatRepository chatRepository;

    @Autowired
    private MessageRepository messageRepository;

    @Override
    public GroupChat addChat(GroupChat chat) {
        return chatRepository.save(chat);
    }

    @Override
    public List<GroupChat> findallchats() throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findallchats'");
    }

    @Override
    public GroupChat getById(int id) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public HashSet<GroupChat> getChatByFirstUserName(String username) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getChatByFirstUserName'");
    }

    @Override
    public HashSet<GroupChat> getChatBySecondUserName(String username) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getChatBySecondUserName'");
    }

    @Override
    public HashSet<GroupChat> getChatByFirstUserNameOrSecondUserName(String username) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getChatByFirstUserNameOrSecondUserName'");
    }

    @Override
    public HashSet<GroupChat> getChatByFirstUserNameAndSecondUserName(String firstUserName, String secondUserName)
            throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getChatByFirstUserNameAndSecondUserName'");
    }

    @Override
    public GroupChat addMessage(Message add, int chatId) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addMessage'");
    }

    @Override
    public Message addMessage2(Message message) {
        return messageRepository.save(message);
    }

    @Override
    public List<Message> getAllMessagesInChat(int chatId) throws Exception {
        Optional<GroupChat> chat = chatRepository.findById(chatId);

        if (chat.isEmpty()) {
            throw new Exception();
        } else {
            return chat.get().getMessageList();
        }
    

    
}
