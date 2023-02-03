package com.quack.talk.common.util;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Component
public class FcmUtil {

    public String getFcmTopic(String roomId){
        return roomId.replaceAll(":","-");
    }

}
