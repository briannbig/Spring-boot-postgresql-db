package com.brianbig.polan.controllers;

import com.brianbig.polan.model.User;
import com.brianbig.polan.repository.DataManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping("/all")
    public List<User> users(){
        return DataManager.getInstance().getUsers();
    }
    @GetMapping(value = "/{userName}")
    public User userByName(@PathVariable("userName") String userName){
        return DataManager.getInstance().getUserByName(userName);
    }
    @PostMapping("/createUser")
    public void createUser(@RequestBody User user){
        DataManager.getInstance().createUser(user);
    }
}
