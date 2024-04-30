package org.sanqi.demo.test;

import org.junit.jupiter.api.Test;
import org.sanqi.demo.entity.User;
import org.sanqi.demo.mapper.BaseMapper;
import org.sanqi.demo.services.UserServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.Valid;

/**
 * @author: JenSen
 * @Date: 2024/4/17 16:35
 * @Description: UserTest
 */
@SpringBootTest
public class UserTest {
    @Autowired
    private BaseMapper baseMapper;
    @Autowired
    private UserServicesImpl userServices;
    @Test
    void testOne(){
        System.out.println(baseMapper.findUserByUserId(1));
    }

    @Test
    void testTwo(){
        User build = User.builder().id(1L).phone("123").build();
    }
}
