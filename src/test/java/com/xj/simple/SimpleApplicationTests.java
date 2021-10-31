package com.xj.simple;

import com.xj.simple.domain.po.User;
import com.xj.simple.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SimpleApplicationTests {

    @Autowired
    private IUserService userService;

    @Test
    void contextLoads() {

        User user = userService.getById(1);
        System.out.println(user);
    }

}
