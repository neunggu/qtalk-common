package com.quack.talk.common.friend.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Friend {
    private String id;
    private String phone;
    private String name;
    private String nickName;
    private String image;
    private String email;
    private String pushToken;
    private int requestStatus;
    private long lastMessageReadTimestamp;

}
