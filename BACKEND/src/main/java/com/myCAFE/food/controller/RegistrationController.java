package com.myCAFE.food.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.myCAFE.food.dao.UserDaoImpl;
import com.myCAFE.food.model.User;

@RestController
@CrossOrigin()
public class RegistrationController {

    @Autowired
    private UserDaoImpl userDao;

    @RequestMapping("/api/register")
    public User showRegister() {
        return new User();
    }

    @PostMapping("/register")
    public User addUser(@RequestBody User user, Model model) {
        System.out.println(user.toString());
        userDao.register(user);
        return user;
    }

    @PostMapping("/checkUserName")
    public boolean checkAvailability(@RequestBody String username, Model model){
        return userDao.usernameExists(username);
    }
}
