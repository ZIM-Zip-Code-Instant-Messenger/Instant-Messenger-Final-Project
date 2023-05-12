package com.example.ZIMNEW.Service;

import java.util.HashSet;
import java.util.List;

import com.example.ZIMNEW.Model.GroupChat;
import com.example.ZIMNEW.Model.Message;

public interface GroupChatService {

    public GroupChat addChat(GroupChat chat) throws Exception;

    List<GroupChat> findallchats() throws Exception;

    GroupChat getById(int id) throws Exception;

    HashSet<GroupChat> getChatByFirstUserName(String username) throws Exception;

    HashSet<GroupChat> getChatBySecondUserName(String username) throws Exception;

    HashSet<GroupChat> getChatByFirstUserNameOrSecondUserName(String username) throws Exception;

    HashSet<GroupChat> getChatByFirstUserNameAndSecondUserName(String firstUserName, String secondUserName)
            throws Exception;

    GroupChat addMessage(Message add, int chatId) throws Exception;

    Message addMessage2(Message message);

    List<Message> getAllMessagesInChat(int chatId) throws Exception;

}