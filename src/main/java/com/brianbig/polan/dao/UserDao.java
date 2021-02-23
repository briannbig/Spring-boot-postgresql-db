package com.brianbig.polan.dao;

import com.brianbig.polan.model.User;

import java.util.List;

public interface UserDao {
    List<User> employees();
    void insertEmployee(User user);
    void updateEmployee(User user);
    void deleteEmployee(User user);

}
