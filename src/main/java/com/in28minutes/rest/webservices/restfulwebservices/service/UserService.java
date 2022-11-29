package com.in28minutes.rest.webservices.restfulwebservices.service;

import com.in28minutes.rest.webservices.restfulwebservices.model.User;
import com.in28minutes.rest.webservices.restfulwebservices.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUser() {
        return userRepository.getUser();
    }
}
