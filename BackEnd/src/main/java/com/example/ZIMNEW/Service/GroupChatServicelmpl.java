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
        if (chatRepository.findAll().isEmpty()) {
            throw new Exception("No chat exists exists in repository");
        } else {
            return chatRepository.findAll();
        }
    }

    @Override
    public GroupChat getById(int id) throws Exception {
        Optional<GroupChat> chatid = chatRepository.findById(id);
        if (chatid.isPresent()) {
            return chatid.get();
        } else {
            throw new Exception("No chat Found");
        }
    }

    @Override
    public HashSet<GroupChat> getChatByFirstUserName(String username) throws Exception {
        HashSet<GroupChat> chat = chatRepository.getChatByFirstUserName(username);

        if (chat.isEmpty()) {
            throw new Exception("User not found");
        } else {
            return chat;
        }

    }

    @Override
    public HashSet<GroupChat> getChatBySecondUserName(String username) throws Exception {
        HashSet<GroupChat> chat = chatRepository.getChatBySecondUserName(username);

        if (chat.isEmpty()) {
            throw new Exception("User not found");
        } else {
            return chat;
        }
    }

    @Override
    public HashSet<GroupChat> getChatByFirstUserNameOrSecondUserName(String username) throws Exception {
        HashSet<GroupChat> chat = chatRepository.getChatByFirstUserName(username);
        HashSet<GroupChat> chat1 = chatRepository.getChatBySecondUserName(username);

        chat1.addAll(chat);

        if (chat.isEmpty() && chat1.isEmpty()) {
            throw new Exception();
        } else if (chat1.isEmpty()) {
            return chat;
        } else {
            return chat1;
        }
    }

    @Override
    public HashSet<GroupChat> getChatByFirstUserNameAndSecondUserName(String firstUserName, String secondUserName)
            throws Exception {
        HashSet<GroupChat> chat = chatRepository.getChatByFirstUserNameAndSecondUserName(firstUserName, secondUserName);
        HashSet<GroupChat> chat1 = chatRepository.getChatBySecondUserNameAndFirstUserName(firstUserName,
                secondUserName);

        if (chat.isEmpty() && chat1.isEmpty()) {
            throw new Exception();
        } else if (chat.isEmpty()) {
            return chat1;
        } else {
            return chat;
        }
    }

    @Override
    public GroupChat addMessage(Message add, int chatId) throws Exception {
        Optional<GroupChat> chat = chatRepository.findById(chatId);
        GroupChat chatGet = chat.get();

        if (chatGet.getMessageList() == null) {
            List<Message> msg = new ArrayList<>();
            msg.add(add);
            chatGet.setMessageList(msg);
            return chatRepository.save(chatGet);
        } else {
            List<Message> rates = chatGet.getMessageList();
            rates.add(add);
            chatGet.setMessageList(rates);
            return chatRepository.save(chatGet);
        }

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
}
