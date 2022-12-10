package com.example.lesson1.service;

import com.example.lesson1.dto.UserDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{
    public static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
    @Override
    public void createUser(UserDto userDto) {
        LOGGER.info("User has been created");
    }
}
