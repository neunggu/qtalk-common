package com.quack.talk.common.friend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FriendDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String phone;
    private String name;
    private String nickName;
    private String image;
    private String email;
    private String pushToken;
    private int requestStatus;
    private long lastMessageReadTimestamp;

//    public FriendDTO(String id, String phone, String name, String nickName, String image, String email, String pushToken) {
//        this.id = id;
//        this.phone = phone;
//        this.name = name;
//        this.nickName = nickName;
//        this.image = image;
//        this.email = email;
//        this.pushToken = pushToken;
//    }

}
