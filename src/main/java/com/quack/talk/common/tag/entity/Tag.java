package com.quack.talk.common.tag.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Tag {

    private int seq;
    private String tag;
    private int type;
    private int status;
    private String create_time;
}
