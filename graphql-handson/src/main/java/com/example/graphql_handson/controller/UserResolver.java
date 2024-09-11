package com.example.graphql_handson.controller;

import com.example.graphql_handson.model.User;
import com.example.graphql_handson.service.UserService;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserResolver {

    private final UserService userService;

    public UserResolver(UserService userService) {
        this.userService = userService;
    }

    @QueryMapping
    public List<User> users() {
        return userService.getUsers();
    }
}
