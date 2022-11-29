package com.in28minutes.rest.webservices.restfulwebservices.resource;

import com.in28minutes.rest.webservices.restfulwebservices.model.User;
import com.in28minutes.rest.webservices.restfulwebservices.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public User getUser() {
        return userService.getUser();
    }
}
