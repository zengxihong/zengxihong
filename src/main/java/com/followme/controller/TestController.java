package com.followme.controller;


import com.alibaba.fastjson.JSON;
import com.followme.common.utils.LogUtil;
import com.followme.model.User;
import com.followme.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * Created by ZengXihong 2019-04-13.
 */
@Controller
public class TestController {
    @Autowired
    private UserService userService;

    /**
     * map
     * @param map
     * @return
     */
    @RequestMapping("/user")
    public String sayHello(Map<String,Object> map){
        List<User> userInfos = userService.getUser();
         map.put("userInfos",userInfos);
        return "userInfo";
    }

    /**
     * model
     * @param model
     * @return
     */
    @RequestMapping("/user2")
    public String sayHello2(Model model){
        List<User> userInfos = userService.getUser();
        model.addAttribute("userInfos",userInfos);
        return "userInfo";
    }
}
