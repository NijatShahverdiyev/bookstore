package com.developia.bookstore.service;

import com.developia.bookstore.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void register(User user);
    void login(User user);
    User findByUsername(String username);
    //User findByPassword(String password);
}
