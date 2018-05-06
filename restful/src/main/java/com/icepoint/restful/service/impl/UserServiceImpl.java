package com.icepoint.restful.service.impl;

import java.util.List;

import com.icepoint.restful.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icepoint.restful.pojo.User;
import com.icepoint.restful.dao.UserDao;
import com.icepoint.restful.service.UserService;

@Service(value = "userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public boolean addUser(User user){
        boolean flag = false;
        try{
            userDao.addUser(user);
            flag = true;
        }catch(Exception e){
            System.out.println("Add Failed!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateUser(User user){
        boolean flag = false;
        try{
            userDao.updateUser(user);
            flag = true;
        }catch(Exception e){
            System.out.println("Update Failed!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteUser(int id){
        boolean flag = false;
        try{
            userDao.deleteUser(id);
            flag = true;
        }catch(Exception e){
            System.out.println("Delete Failed!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public User findUserByName(String userName){
        return userDao.findByName(userName);
    }

    @Override
    public List<User> findAll(){
        return userDao.findAll();
    }
}
