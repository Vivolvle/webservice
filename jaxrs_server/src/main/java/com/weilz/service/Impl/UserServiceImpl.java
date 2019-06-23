package com.weilz.service.Impl;

import com.weilz.entity.User;
import com.weilz.service.IUserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: alphago
 * @Date: 2019/3/8 14:30
 * @Version 1.0
 */
public class UserServiceImpl implements IUserService {
    @Override
    public void saveUser(User user) {
        System.out.println("the user have been saved:"+user.toString());
    }

    @Override
    public void updateUser(User user) {
        System.out.println("the user have been updated:"+user.toString());
    }

    @Override
    public List<User> findAllUsers() {
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setId(1);
        user.setUsername("jack");
        user.setCity("广州");
        User user1 = new User();
        user1.setId(2);
        user1.setUsername("rose");
        user1.setCity("四川");
        users.add(user);
        users.add(user1);
        return users;
    }

    @Override
    public User findUserById(Integer id) {
        if(id==1){
            User user = new User();
            user.setId(1);
            user.setUsername("jack");
            user.setCity("广州");
            return user;
        }
        return null;
    }

    @Override
    public void deleteUser(Integer id) {
        System.out.println("you have deleted the "+id);
    }
}
