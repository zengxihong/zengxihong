package com.followme.service.impl;

import com.followme.model.User;
import com.followme.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZengXihong 2019-04-13.
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getUser() {
       List<User> userList=new ArrayList<>();
        User user1 = new User("aaa",1,12);
        User user2 = new User("bbb",0,10);
        User user3 = new User("bbb",1,15);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        return userList;
    }
}
