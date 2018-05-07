package ua.com.owu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.owu.dao.UserDao;
import ua.com.owu.models.User;
import ua.com.owu.service.UserService;


@Service("userService2")

public class UserServiceImpl2 implements UserService {

@Autowired
    private UserDao userDao;

    public UserServiceImpl2() {
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save(String name) {

        User user = new User();
        user.setName(name);
        userDao.save(new User());

    }
}
