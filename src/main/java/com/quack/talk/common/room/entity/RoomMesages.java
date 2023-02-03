package com.quack.talk.common.room.entity;

import com.quack.talk.common.chat.entity.Message;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class RoomMesages {
    //mongo id
    private String _id;
    private String roomId;
    private List<Message> messages;
}
