package com.soft.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by xuweiwei on 2017/7/1.
 */
@Controller
public class TestAction {

    /**
     * 1. 使用RequestMapping注解来映射请求的URL
     * 2. 返回值会通过视图解析器解析为实际的物理视图, 对于InternalResourceViewResolver视图解析器，会做如下解析
     * 通过prefix+returnVal+suffix 这样的方式得到实际的物理视图，然后会转发操作
     * "/WEB-INF/views/success.jsp"
     * @return
     */
    @RequestMapping("/helloword" )
    public ModelAndView test(){
        ModelAndView view = new ModelAndView();
        view.addObject("hello","hello world");
        view.addObject("world", "i am comming");
        view.setViewName("/demo/helloworld");

        System.out.println("hello world");
        return view;
    }
}
