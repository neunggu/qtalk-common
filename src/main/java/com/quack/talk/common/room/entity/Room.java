package com.quack.talk.common.room.entity;

import com.quack.talk.common.friend.entity.Friend;
import com.quack.talk.common.room.type.RoomType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Room {

    //mongo id
    private String _id;
    private String roomId;
    private String leaderId;
    private String photo;
    private RoomType roomType;
    private String title;
    private String introduce;
    private List<String> tags;
    private boolean searchPermit;
    private List<Friend> users;
    private int userCount;
    private int qCount;

    private String serverNick;
    private String createTime;
    private String updateTime;

    public static Room create(String roomId, String leaderId, String photo, RoomType roomType, String title,
                                  String introduce, List tags, boolean searchPermit, List users,
                                  String serverNick, String currentTime) {
        Room room = new Room();
        room.roomId = roomId;
        room.leaderId = leaderId;
        room.photo = photo;
        room.roomType = roomType;
        room.title = title;
        room.introduce = introduce;
        room.tags = tags;
        room.searchPermit = searchPermit;
        room.users = users;
        room.userCount = users.size();
        room.qCount = 0;
        room.serverNick = serverNick;
        room.createTime = currentTime;
        room.updateTime = currentTime;
        return room;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRoomId());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Room)) return false;
        Room room = (Room) obj;
        return Objects.equals(getRoomId(), room.getRoomId());
    }
}
