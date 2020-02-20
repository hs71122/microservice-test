package com.test.userservice;

import com.test.userservice.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @Autowired
    private UserDao userDao;
}
