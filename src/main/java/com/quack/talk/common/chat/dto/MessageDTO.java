package com.quack.talk.common.chat.dto;

import com.quack.talk.common.chat.type.MessageType;
import com.quack.talk.common.room.type.RoomType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private MessageType type;
    private RoomType roomType;
    private String chatId;
    private String roomId;
    private String title;
    private String sender;
    private String senderId;
    private String senderImage;
    private String recipient;
    private String recipientId;
    private String message;
    private long timestamp;
    private long unReadCount;
}
