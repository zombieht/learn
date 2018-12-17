package com.zombie.demo.service.impl;

import com.zombie.demo.domain.entity.User;
import com.zombie.demo.repository.UserRepository;
import com.zombie.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User get() {
        return userRepository.findById(1L).get();
    }

    @Override
    public User add(User user) {
        User u = userRepository.save(user);
        return u;
    }
}
