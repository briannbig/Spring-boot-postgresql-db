package com.brianbig.polan.repository;

import com.brianbig.polan.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private List<User> users;
    private static DataManager instance = null;

    public static DataManager getInstance() {
        if (instance == null){
            instance = new DataManager();
            instance.users = new ArrayList<>();
            instance.initData();
        }
        return instance;
    }

    private void initData() {
        users.add(new User("mike001", "mike@domain.com"));
        users.add(new User("mike002", "mike2@domain.com"));
        users.add(new User("mike003", "mike3@domain.com"));
        users.add(new User("mike004", "mike4@domain.com"));
        users.add(new User("mike005", "mike5@domain.com"));
    }

    public List<User> getUsers() {
        return users;
    }
    public User getUserByName(String name){
        User user = new User("undefined", "undefined");
        for (User user1 :
                users) {
            if (user1.getUserName().equals(name))
                user = user1;
        }
        return user;
    }

    public void createUser(User user) {
        users.add(user);
    }
}
