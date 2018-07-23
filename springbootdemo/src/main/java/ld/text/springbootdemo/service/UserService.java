package ld.text.springbootdemo.service;

import ld.text.springbootdemo.domain.User;

public interface UserService {
    User findUserByName(String userName);
}
