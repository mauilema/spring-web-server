package com.in28minutes.rest.webservices.restfulwebservices.repository;

import com.in28minutes.rest.webservices.restfulwebservices.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public User getUser() {
        User user = new User("Jose", "lvl 7 backend st", 27);
        return user;
    }
}
