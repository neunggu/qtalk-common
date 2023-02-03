package com.quack.talk.common.room.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SearchHistory {
    //mongo id
    private String _id;
    private String keyword;
    private String userId;
    private String createTime;

    public SearchHistory(String keyword, String userId, String createTime) {
        this.keyword = keyword;
        this.userId = userId;
        this.createTime = createTime;
    }
}
