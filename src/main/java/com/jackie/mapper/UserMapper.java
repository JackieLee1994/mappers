package com.jackie.mapper;

import com.jackie.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by lwxzbh on 2017/7/24.
 */
@Mapper
public interface UserMapper {
    User findById(int id);
    void insertUser(User user);
}
