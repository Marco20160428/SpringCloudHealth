package com.example.interventionservice.client;

import com.example.interventionservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UserServiceClient {

    @Autowired
    private RestTemplate restTemplate;

    public User getUserByUserName(String userName){
        ResponseEntity<User> responseEntity = restTemplate.exchange(
                 "http://userservice/users/{userName}",
                 HttpMethod.GET,
                 null, User.class, userName);
         User user = responseEntity.getBody();
         return user;
 }
}
