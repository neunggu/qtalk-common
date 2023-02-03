package com.quack.talk.common.fcm.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NotificationRequestDto {
    private String target;
    private String title;
    private String sender;
    private String body;
}
