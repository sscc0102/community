package com.alan.community.dao;

import com.alan.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Alan
 * @version 1.0
 * @date 2022/9/20 2:16
 */
@Mapper
public interface UserMapper {

    User selectById(int id);
}