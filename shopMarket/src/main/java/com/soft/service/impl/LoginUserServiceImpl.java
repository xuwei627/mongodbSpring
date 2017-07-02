package com.soft.service.impl;

import com.soft.dao.LoginUserDao;
import com.soft.dao.model.UserModel;
import com.soft.dto.member.UserDto;
import com.soft.service.LoginUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by xuweiwei on 2017/7/1.
 */
@Service("loginUserService")
public class LoginUserServiceImpl implements LoginUserService {

    @Resource
    private LoginUserDao loginUserDao;


    public UserModel findById(Integer id) {
        return loginUserDao.findById(1);
    }

    public int createUser(String username, String password) {
        UserModel userModel = new UserModel();
        userModel.setAccount(username);
        userModel.setPassword(password);
        userModel.setCreateDate(new Date());
        userModel.setStatus(1);
        userModel.setLeval(1);
        int result = loginUserDao.save(userModel);
        return result;
    }
}
