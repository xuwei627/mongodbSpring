package com.soft.dao;

import com.soft.model.UserHobbyModel;
import com.soft.model.UserModel;

import java.util.List;

/**
 * Created by xuweiwei on 2017/6/24.
 */
public interface UserDao {

    void insert(String name, String password, List<UserHobbyModel> hobbyModel);
    List<UserModel> findByName(String name);

}
