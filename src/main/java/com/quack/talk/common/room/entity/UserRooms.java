package com.quack.talk.common.room.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRooms {
    //mongo id
    private String _id;
    private String userId;
    private List<String> roomIds;
    private List<Room> rooms;
}
