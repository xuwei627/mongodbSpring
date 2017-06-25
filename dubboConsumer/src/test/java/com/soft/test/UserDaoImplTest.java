package com.soft.test;

import com.soft.dao.UserDao;
import com.soft.model.UserHobbyModel;
import com.soft.model.UserModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuweiwei on 2017/6/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-consumer.xml")
public class UserDaoImplTest {

    @Resource(name = "userDao")
    UserDao userDao;

    @Test
    public void insert() throws Exception {
        System.out.println("insert start .....");
        List<UserHobbyModel> list = new ArrayList<UserHobbyModel>();
        list.add(new UserHobbyModel("吹箫11"));
        list.add(new UserHobbyModel("吹箫111"));
        list.add(new UserHobbyModel("吹箫1111"));
        userDao.insert("小红", "123456", list);
        System.out.println("insert end .....");
    }

    @Test
    public void findByName() throws Exception {
        System.out.println("findByName start .....");
        List<UserModel> users = userDao.findByName("小红");
        for (UserModel userModel : users) {
            System.out.print("姓名：" + userModel.getName() + "  密码：" + userModel.getPassword() + "  爱好：");
            for (UserHobbyModel userHobbyModel : userModel.getHobbyModelList()) {
                System.out.print(userHobbyModel + ",");
            }
            System.out.println();
        }
        System.out.println("findByName end .....");
    }

}