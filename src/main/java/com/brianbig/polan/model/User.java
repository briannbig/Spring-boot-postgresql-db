package com.brianbig.polan.model;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

public class User {
    private final String userName;
    private final String email;

    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public String getUserName() {
        return userName;
    }
}

//@Repository
class UserDao implements com.brianbig.polan.dao.UserDao {

    NamedParameterJdbcTemplate template;

    public UserDao(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public List<User> employees() {
//        return template.query("select * from employee",);
        return null;
    }

    @Override
    public void insertEmployee(User employee) {

    }

    @Override
    public void updateEmployee(User employee) {

    }

    @Override
    public void deleteEmployee(User employee) {

    }
}
