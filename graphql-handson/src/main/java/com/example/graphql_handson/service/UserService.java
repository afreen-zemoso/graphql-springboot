package com.example.graphql_handson.service;

import com.example.graphql_handson.model.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    private final RestTemplate restTemplate;

    public UserService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<User> getUsers() {
        String url = "https://jsonplaceholder.typicode.com/users";
        User[] usersArray = restTemplate.getForObject(url, User[].class);
        return Arrays.asList(usersArray);
    }
}
