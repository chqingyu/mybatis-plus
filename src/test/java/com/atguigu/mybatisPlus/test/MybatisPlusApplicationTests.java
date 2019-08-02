package com.atguigu.mybatisPlus.test;

import com.atguigu.mybatisPlus.entity.User;
import com.atguigu.mybatisPlus.mapper.UserMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        user.setAge(19);
        user.setEmail("55317332@qq.com");
        int result = userMapper.insert(user);
        System.out.println(result);
        System.out.println(user);
    }

    @Test
    public void testUpdatById(){

        User user = new User();
        user.setId(1L);
        user.setAge(27);

        int result = userMapper.updateById(user);
        System.out.println(result);

    }


    @Test
    public void testSelectById(){

        // 根据id查询记录
        User user = userMapper.selectById(1L);
        System.out.println(user);
    }

    @Test
    public void testSelectBatchIds(){

        // 通过多个id批量查询
        List<User> users = userMapper.selectBatchIds(Arrays.asList(1, 2, 3));
        users.forEach(System.out::println);
    }


    @Test
    public void testSelectByMap(){

        // 通过map封装查询条件 where name=?and age =?
        Map<String,Object> map = new HashMap<>();
        map.put("name","Helen");
        map.put("age",18);
        List<User> users = userMapper.selectByMap(map);
        users.forEach(System.out::println);

    }

    @Test
    public void testSelectPage(){

        // 测试selectPage分页
        Page<User> page = new Page<>(1, 5);
        userMapper.selectPage(page, null);
        page.getRecords().forEach(System.out::println);

    }



}
