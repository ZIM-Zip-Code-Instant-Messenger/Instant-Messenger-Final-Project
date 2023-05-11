package com.example.ZIMNEW.Message;

import java.security.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "message")
public class Message {
    @Id
    private Long groupchatid;
    @Column
    private String message;
    @Column
    private Timestamp time;

    public Message() {
    }

    public Message(Long groupid, String message, Timestamp time) {
        this.groupchatid = groupid;
        this.message = message;
        this.time = time;

    }

    public Long getGroupchatid() {
        return groupchatid;
    }

    public void setGroupchatid(Long groupid) {
        this.groupchatid = groupid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

}