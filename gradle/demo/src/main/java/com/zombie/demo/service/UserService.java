package com.zombie.demo.service;

import com.zombie.demo.domain.entity.User;

public interface UserService {
    User get();

    User add(User user);
}
