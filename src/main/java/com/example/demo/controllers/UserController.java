package com.example.demo.controllers;


import com.example.demo.models.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getAllRegisteredUsers")
    public List<User> getAllRegisteredUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/addUser")
    public void addNewUser(@RequestBody User user) {
        userService.saveUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
    }

    @PutMapping("/updateUser/{id}")
    public void updateUser(@PathVariable("id") Long id, @RequestBody User user) {
        userService.updateUser(id, user);
    }

    // Custom Controller Methods

    @GetMapping("/getUser/{id}")
    public User getSingleUser(@PathVariable("id") Long id) {
        return userService.getUser(id);
    }

    @PatchMapping("/updateUserCreds/{id}")
    public void updateUserCreds(@PathVariable("id") Long id, @RequestBody @NotNull User user) {
        userService.updateUserCredentials(id, user);
    }
}

