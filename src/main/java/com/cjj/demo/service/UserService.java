package com.cjj.demo.service;

import com.cjj.demo.po.User;

public interface UserService {

    User checkUser(String username, String password);
}
