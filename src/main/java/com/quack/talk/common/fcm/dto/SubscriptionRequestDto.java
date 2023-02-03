package com.quack.talk.common.fcm.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class SubscriptionRequestDto {
    String topicName;
    List<String> tokens;
}
