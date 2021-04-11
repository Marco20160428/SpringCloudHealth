package com.example.interventionservice.controller;

import com.example.interventionservice.client.UserServiceClient;
import com.example.interventionservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Simple&Happiness
 * @Date 2020/12/5 16:53
 * @Description
 **/
@RestController
@RequestMapping("/intervention")
public class UserServiceClientController {

    @Autowired
    private UserServiceClient userServiceClient;

    @GetMapping("/{userName}")
    public User getUserByUserName(@PathVariable String userName){
        return userServiceClient.getUserByUserName(userName);
    }
}
