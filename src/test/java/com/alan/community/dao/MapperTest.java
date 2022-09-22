package com.alan.community.dao;

import com.alan.community.NowcoderCommunityApplication;
import com.alan.community.entity.DiscussPost;
import com.alan.community.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Alan
 * @version 1.0
 * @date 2022/9/19 20:43
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = NowcoderCommunityApplication.class)
class MapperTest {

    @Autowired
    private DiscussPostMapper discussPostMapper;
    @Autowired
    private UserMapper userMapper;

    @Test
    void selectDiscussPosts() {
        List<DiscussPost> list = discussPostMapper.selectDiscussPosts(149, 0, 10);
        list.forEach(System.out::println);
    }

    @Test
    void selectDiscussPostRows() {
        int i = discussPostMapper.selectDiscussPostRows(0);
        System.out.println(i);
    }

    @Test
    void selectById() {
        User user = userMapper.selectById(11);
        System.out.println(user);
    }
}