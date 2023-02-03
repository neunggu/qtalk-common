package com.quack.talk.common.chat.entity;

import com.quack.talk.common.chat.type.MessageType;
import com.quack.talk.common.room.type.RoomType;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Message {
    private MessageType type;
    private RoomType roomType;
    private String chatId;
    private String roomId;
    private String sender;
    private String senderId;
    private String senderImage;
    private String recipient;
    private String recipientId;
    private String message;
    private long timestamp;
    private long unReadCount;
}
