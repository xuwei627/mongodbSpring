package com.soft.dao.impl;

import com.soft.dao.AppointOrderChangeHistoryDao;
import com.soft.dao.MongoBaseDao;
import com.soft.model.AppointOrderChangeHistoryModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by xuweiwei on 2017/6/24.
 */
@Component(value = "appointOrderChangeHistoryDao")
public class AppointOrderChangeHistoryDaoImpl extends MongoBaseDao implements AppointOrderChangeHistoryDao  {

    @Override
    public List<AppointOrderChangeHistoryModel> queryByMap(Map<String, Object> param) {
        return mongoTemplate.find(createQueryByMap(param), AppointOrderChangeHistoryModel.class);
    }

    @Override
    public <T> void save(T t) {
        mongoTemplate.save(t);
    }
}
