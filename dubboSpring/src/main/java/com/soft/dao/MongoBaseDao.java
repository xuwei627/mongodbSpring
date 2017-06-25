package com.soft.dao;

import com.soft.model.AppointOrderChangeHistoryModel;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by xuweiwei on 2017/6/24.
 */
public abstract class MongoBaseDao {
    @Resource(name="mongoTemplate")
    protected MongoTemplate mongoTemplate;
    private Criteria c = null;


    protected Query createQueryByMap(Map<String,Object> param){
        Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();

        while(it.hasNext()){
            setCriteria(it.next());
        }
        return new Query(c);
    }

    private void setCriteria(Map.Entry<String, Object> entry){
        if(c == null)
            setWhere(entry.getKey(), entry.getValue());
        else
            setAnd(entry.getKey(), entry.getValue());
    }

    private Criteria setWhere(String selectField, Object value){
        return c = Criteria.where(selectField).is(value);
    }

    private Criteria setAnd(String selectField, Object value){
        return c.and(selectField).is(value);
    }
}
