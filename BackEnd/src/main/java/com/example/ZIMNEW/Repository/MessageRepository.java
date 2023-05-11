package com.example.ZIMNEW.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ZIMNEW.Model.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

}
