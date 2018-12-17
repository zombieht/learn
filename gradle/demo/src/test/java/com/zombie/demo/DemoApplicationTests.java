package com.zombie.demo;

import com.zombie.demo.domain.entity.User;
import com.zombie.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {


    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void add() {
        User user = new User();
        String a = "root";
        user.setPassword(passwordEncoder.encode(a));
        user.setUsername("小明");
        userService.add(user);
    }

    @Test
    public void get() {
        User user = userService.get();
        System.out.println(user);

    }

}
