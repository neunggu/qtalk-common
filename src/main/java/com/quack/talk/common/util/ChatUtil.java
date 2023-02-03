package com.quack.talk.common.util;

import com.quack.talk.common.room.type.RoomType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Component
public  class ChatUtil {

    public String createRoomId(RoomType roomtype, long currentTimeMillis) {
        long days = currentTimeMillis/(1000*60*60*24);
        return roomtype.getValue()+":"+days+":"+uuid();
    }

    public String createChatId(String roomId) {
        return "msg"+":"+roomId+":"+ uuid();
    }

    public String getRoomIdFromChatId(String chatId){
        String[] chatIdArray = chatId.split(":");
        return chatIdArray[1]+":"+chatIdArray[2]+":"+chatIdArray[3];
    }

    public <T> T[] toArray(List<T> list, Class<T> TClass) {
        T[] newT = (T[]) Array.newInstance(TClass, list.size());
        return list.toArray(newT);
    }

    private String uuid(){
        return UUID.randomUUID().toString().replace("-","");
    }

}
