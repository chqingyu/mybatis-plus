package com.atguigu.mybatisPlus.test;

import com.atguigu.mybatisPlus.entity.User;
import com.atguigu.mybatisPlus.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisPlusApplicationTests {

    @Autowired
    private UserMapper userMapper;


    @Test
    public void testSelectList(){

        System.out.println("--------selectAll method test----");

        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    public void testInsert(){

        User user = new User();
        user.setName("Helen");
        user.setAge(18);
        user.setEmail("55317332@qq.com");
        int result = userMapper.insert(user);
        System.out.println(result);
        System.out.println(user);
    }

    @Test
    public void testUpdatById(){

        User user = new User();
        user.setId(1L);
        user.setAge(28);

        int result = userMapper.updateById(user);
        System.out.println(result);

    }


}
