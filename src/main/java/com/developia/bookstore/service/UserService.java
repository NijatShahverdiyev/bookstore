package com.developia.bookstore.service;

import com.developia.bookstore.model.User;
import com.developia.bookstore.model.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void register(User user);
    boolean login(UserDto userDto);
    User findByUsername(String username);
    //User findByPassword(String password);
}
