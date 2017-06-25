package impl;


import com.soft.dao.AppointOrderChangeHistoryDao;
import com.soft.dao.UserDao;
import com.soft.model.AppointOrderChangeContentModel;
import com.soft.model.AppointOrderChangeHistoryModel;
import com.soft.model.UserHobbyModel;
import com.soft.model.UserModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.*;

/**
 * Created by xuweiwei on 2017/6/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserDaoImplTest {

    @Resource(name = "userDao")
    UserDao userDao;

    @Resource(name = "appointOrderChangeHistoryDao")
    AppointOrderChangeHistoryDao appointOrderChangeHistoryDao;

    @Test
    public void insert() throws Exception {
        System.out.println("insert start .....");
        List<UserHobbyModel> list = new ArrayList<UserHobbyModel>();
        list.add(new UserHobbyModel("吹箫"));
        list.add(new UserHobbyModel("吹箫"));
        list.add(new UserHobbyModel("吹箫"));
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

    @Test
    public void testInsert(){
        AppointOrderChangeHistoryModel hist = new AppointOrderChangeHistoryModel();
        hist.setAppointOrderNo("1234");
        hist.setId("1");
        hist.setCreateBy("xww");
        hist.setCreateDate(new Date());
        hist.setCommont("今天心情好 修一下玩玩");
        AppointOrderChangeContentModel cont = new AppointOrderChangeContentModel();
        cont.setChangeField("预约方式");
        cont.setChangeBefore("无卡预约");
        cont.setChangeAfter("保险预约");
        AppointOrderChangeContentModel cont1 = new AppointOrderChangeContentModel();
        cont1.setChangeField("年龄");
        cont1.setChangeBefore("20");
        cont1.setChangeAfter("18");
        AppointOrderChangeContentModel cont2 = new AppointOrderChangeContentModel();
        cont2.setChangeField("就诊人");
        cont2.setChangeBefore("小红");
        cont2.setChangeAfter("小明");
        List<AppointOrderChangeContentModel> list = new ArrayList<AppointOrderChangeContentModel>();
        list.add(cont);
        list.add(cont1);
        list.add(cont2);
        hist.setChangeContentList(list);
        appointOrderChangeHistoryDao.save(hist);
    }

    @Test
    public void testfind(){

        Map<String, Object> par = new HashMap<String, Object>();
        par.put("appointOrderNo", "1234");
        List<AppointOrderChangeHistoryModel>  list = appointOrderChangeHistoryDao.queryByMap(par);
        for(AppointOrderChangeHistoryModel a :list){
            System.out.println(a);
            for(AppointOrderChangeContentModel b : a.getChangeContentList()){
                System.out.println(b);
            }
        }
    }

}