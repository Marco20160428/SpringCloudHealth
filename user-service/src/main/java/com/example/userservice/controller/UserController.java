package com.example.userservice.controller;

import com.example.userservice.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/users")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private HttpServletRequest request;

    @Value("${spring.datasource.url}")
    private String url;

    @GetMapping("/{userName}")
    public User getUserByUserName(@PathVariable String userName){
        logger.info("Get user by userName from port : {} of userservice instance", request.getServerPort());
        User user = new User();
        user.setId((long) request.getServerPort());
        user.setUserCode("mockUser");
        user.setUserName(userName);
        return user;
    }
}
