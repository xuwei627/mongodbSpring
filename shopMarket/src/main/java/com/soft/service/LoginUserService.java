package com.soft.service;

import com.soft.dao.model.UserModel;
import com.soft.dto.member.UserDto;

/**
 * Created by xuweiwei on 2017/7/1.
 */
public interface LoginUserService {

    UserModel findById(Integer id);

    int createUser(String username,String password);
}
