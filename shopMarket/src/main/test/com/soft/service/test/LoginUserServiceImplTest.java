package com.soft.service.test;

import com.soft.dao.model.UserModel;
import com.soft.service.LoginUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by xuweiwei on 2017/7/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class LoginUserServiceImplTest {

//    private static Logger logger = Logger.getLogger(TestMyBatis.class);
    @Resource(name = "loginUserService")
    private LoginUserService loginUserService;
    @Test
    public void findById() throws Exception {
        UserModel userModel = loginUserService.findById(1);
        System.out.println(userModel);
    }

    @Test
    public void createUser() throws Exception {
        int saveResult = loginUserService.createUser("xww","123456");
        System.out.println(saveResult);
    }

}