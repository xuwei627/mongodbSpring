package com.soft.action.member;

import com.soft.dto.member.UserDto;
import com.soft.service.LoginUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by xuweiwei on 2017/7/1.
 */
@Controller
public class UserLoginAction {

    @Resource(name="loginUserService")
    private LoginUserService loginUserService;

    @RequestMapping("/doLogin")
    public ModelAndView doLogin() {
        ModelAndView view = new ModelAndView();
        view.setViewName("/user/login");
        return view;
    }

    @RequestMapping("/login")
    public ModelAndView login(UserDto user) {
        ModelAndView view = new ModelAndView();
        int createResult = loginUserService.createUser(user.getUsername(),user.getPassword());
        if(createResult == 0){
            view.setViewName("/error/error");
            return view;
        }
        System.out.println(user);
        view.setViewName("/product/index");
        view.addObject("user",user);
        return view;
    }

}
