package com.soft.dao.impl;

import com.soft.dao.UserDao;
import com.soft.model.UserHobbyModel;
import com.soft.model.UserModel;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xuweiwei on 2017/6/24.
 */
@Component(value = "userDao")
public class UserDaoImpl implements UserDao {

    @Resource(name="mongoTemplate")
    MongoTemplate mongoTemplate;

    public void insert(String name, String password, List<UserHobbyModel> hobbyModel){

        UserModel user = new UserModel();
        user.setName(name);
        user.setPassword(password);
        user.setHobbyModelList(hobbyModel);
        mongoTemplate.insert(user);
    }

    public List<UserModel> findByName(String name) {
        Query query = new Query(Criteria.where("name").is(name));
        return mongoTemplate.find(query, UserModel.class);
//        return mongoTemplate.findAll(UserModel.class);
    }


}
