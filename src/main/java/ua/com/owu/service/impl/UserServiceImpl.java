package ua.com.owu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.owu.dao.UserDao;
import ua.com.owu.models.User;
import ua.com.owu.service.UserService;

@Service


public class UserServiceImpl implements UserService{


    @Autowired
private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(String name){
        if (name!=null && !name.isEmpty()){
            User user = new User();
            user.setName(name);
            userDao.save(user);
        }else {
            System.out.println("ERROR!");
        }
    }
}
