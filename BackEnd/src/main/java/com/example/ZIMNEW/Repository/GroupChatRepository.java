package com.example.ZIMNEW.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ZIMNEW.Model.GroupChat;

@Repository
public interface GroupChatRepository extends JpaRepository<GroupChat, Long> {

}
