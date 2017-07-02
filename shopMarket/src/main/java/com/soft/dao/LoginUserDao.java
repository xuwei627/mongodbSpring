package com.soft.dao;

import com.soft.dao.model.UserModel;

/**
 * Created by xuweiwei on 2017/7/1.
 */

public interface LoginUserDao {

    UserModel findById(Integer id);

    int save(UserModel userModel);

}
