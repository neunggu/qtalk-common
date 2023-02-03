package com.quack.talk.common.room.entity;

import com.quack.talk.common.friend.entity.Friend;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class RoomUsers {
    //mongo id
    private String _id;
    private String roomId;
    private List<Friend> users;
    private int userCount;
}
