package ld.text.springbootdemo.service.impl;

import ld.text.springbootdemo.dao.cluster.UserDao;
import ld.text.springbootdemo.domain.User;
import ld.text.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public User findUserByName(String userName) {
        return userDao.findByName(userName);

    }
}
