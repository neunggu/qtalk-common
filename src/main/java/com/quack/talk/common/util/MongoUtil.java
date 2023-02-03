package com.quack.talk.common.util;

import com.mongodb.BasicDBObject;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public  class MongoUtil {

    public Query getQuery(String key, String value){
        Query query = new Query();
        query.addCriteria(Criteria.where(key).is(value));
        return query;
    }

    public Query getQuery(Criteria criteria){
        Query query = new Query();
        query.addCriteria(criteria);
        return query;
    }

    public Update getUpdate(){
        Update update = new Update();
        return update;
    }

    public Update updatePull(String key, BasicDBObject value){
        Update update = getUpdate();
        update.pull(key, value);
        return update;
    }

    public Update updatePush(String key, Object value){
        Update update = getUpdate();
        update.push(key).atPosition(0).value(value);
        return update;
    }
}
