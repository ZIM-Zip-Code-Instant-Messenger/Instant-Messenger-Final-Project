package com.example.ZIMNEW.Repository;

import java.util.HashSet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ZIMNEW.Model.GroupChat;

@Repository
public interface GroupChatRepository extends JpaRepository<GroupChat, Integer> {

    HashSet<GroupChat> getChatByFirstUser(String username);

    HashSet<GroupChat> getChatBySecondUserName(String username);

    HashSet<GroupChat> getChatByFirstUserNameAndSecondUserName(String firstUserName, String secondUserName);

    HashSet<GroupChat> getChatBySecondUserNameAndFirstUserName(String firstUserName, String secondUserName);

}
