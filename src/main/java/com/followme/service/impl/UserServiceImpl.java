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
        User user1 = new User("aaa",1,12L);
        User user2 = new User("bbb",0,10L);
        User user3 = new User("bbb",1,9123456789012345678L);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        return userList;
    }
}
