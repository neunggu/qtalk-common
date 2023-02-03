package com.quack.talk.common.room.type;

public enum RoomType {
    OPEN_CHAT("open"), CHAT("chat"), GROUP("group");

    String value;
    RoomType(String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }

}
